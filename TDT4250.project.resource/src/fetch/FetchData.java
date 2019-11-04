package fetch;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import com.fasterxml.jackson.databind.ObjectMapper;
import competition.Competition;
import competition.CompetitionFactory;
import competition.CompetitionPackage;
import competition.Match;
import competition.Positon;
import competition.Score;
import competition.Season;
import competition.Standing;
import competition.Status;
import competition.Team;
import competition.Winner;
import jsonModel.CompetitionM;
import jsonModel.MatchM;
import jsonModel.StandingM;
import jsonModel.TeamM;;


public class FetchData {
	public static ObjectMapper objectMapper = new ObjectMapper();
	
	public static void main(String[] args) {		
			try {
			    CompetitionM com = objectMapper.readValue(new URL("file:data/competition-pl.json"), CompetitionM.class);
			    System.out.println(com.name);
			    System.out.println("------");
			
			    TeamM teamM = objectMapper.readValue(new URL("file:data/teams-pl.json"), TeamM.class);
			    System.out.println(teamM.teams.get(1).name);
			    
			    for(int i = 0; i < teamM.teams.size(); i++) {
			    	System.out.println(teamM.teams.get(i).name);
			    }
			    
			    System.out.println("------");
			    
			    MatchM matchM = objectMapper.readValue(new URL("file:data/matches-pl.json"), MatchM.class);
			    for(int i = 0; i < matchM.matches.size(); i++) {
			    	System.out.println(matchM.matches.get(i).homeTeam.name + " ----VS---- " + matchM.matches.get(i).awayTeam.name);
			    }
			    System.out.println("------");
			    
			    StandingM standingM = objectMapper.readValue(new URL("file:data/standing.json"), StandingM.class);
			    for(int i = 0; i < standingM.standings.get(0).table.size(); i++) {
			    	System.out.println(standingM.standings.get(0).table.get(i).position + ": " + standingM.standings.get(0).table.get(i).team.name);
			    }
			    
			    // Initialize the model
				CompetitionPackage.eINSTANCE.eClass();
		        // Retrieve the default factory singleton
				CompetitionFactory factory = CompetitionFactory.eINSTANCE;

		        // create the content of the model via this program
				Competition competition = factory.createCompetition();
				competition.setId(com.id);
				competition.setName(com.name);
				competition.setCode(com.code);
				competition.setArea(com.area.name);
				competition.setPlan(com.plan);
				competition.setLastUpdated(new Date());
				
				// TEAM
				for(int i = 0; i < teamM.teams.size(); i++) {
					Team team = factory.createTeam();
					team.setId(teamM.teams.get(i).id);
			        team.setName(teamM.teams.get(i).name);
			        team.setShortName(teamM.teams.get(i).shortName);
			        team.setTla(teamM.teams.get(i).tla);
			        team.setFounded(teamM.teams.get(i).founded);
			        team.setClubColors(teamM.teams.get(i).clubColors);
			        competition.getTeams().add(team);
			    }
				
				Season season = factory.createSeason();
				season.setId(com.currentSeason.id);
				season.setStartDate(new Date());
				season.setEndDate(new Date());
				season.setCurrentMatchday(com.currentSeason.currentMatchday);
				season.setCompetition(competition);
				
				// MATCH
				for(int i = 0; i < matchM.matches.size(); i++) {
					Match match = factory.createMatch();
					match.setId(matchM.matches.get(i).id);
				
					match.setStatus(Status.valueOf(matchM.matches.get(i).status));
					match.setMatchDay(new Date());
					match.setLastUpdated(new Date());
					match.setSeason(season);
					match.setUtcDate(new Date());
					
					Score score = factory.createScore();
					score.setMatch(match);
					score.setWinner(matchM.matches.get(i).score.winner == null ? null : Winner.valueOf(matchM.matches.get(i).score.winner));
					score.setAwayTeam(matchM.matches.get(i).score.fullTime.awayTeam);
					score.setHomeTeam(matchM.matches.get(i).score.fullTime.homeTeam);
					match.setScore(score);
					
					for(int j = 0; j < competition.getTeams().size(); j++) {
						if(competition.getTeams().get(j).getId() == matchM.matches.get(i).homeTeam.id) {
							match.setHomeTeam(competition.getTeams().get(j));
						}
						if(competition.getTeams().get(j).getId() == matchM.matches.get(i).awayTeam.id) {
							match.setAwayTeam(competition.getTeams().get(j));
						}
					}
					
					season.getMatches().add(match);
				}
				// STANDING
				Standing standing = factory.createStanding();
				for(int i = 0; i < standingM.standings.get(0).table.size(); i++) {
					Positon pos = factory.createPositon();
					pos.setPosition(standingM.standings.get(0).table.get(i).position);
					pos.setPlayedGames(standingM.standings.get(0).table.get(i).playedGames);
					pos.setPoints(standingM.standings.get(0).table.get(i).points);
					pos.setWon(standingM.standings.get(0).table.get(i).won);
					pos.setDraw(standingM.standings.get(0).table.get(i).draw);
					pos.setLost(standingM.standings.get(0).table.get(i).lost);
					pos.setGoalsFor(standingM.standings.get(0).table.get(i).goalsFor);
					pos.setGoalsAgaints(standingM.standings.get(0).table.get(i).goalsAgainst);
					pos.setGoalDifference(standingM.standings.get(0).table.get(i).goalDifference);
					
					for(int j = 0; j < competition.getTeams().size(); j++) {
						if(competition.getTeams().get(j).getId() == standingM.standings.get(0).table.get(i).team.id) {
							pos.setTeam(competition.getTeams().get(j));
						}
						
					}
				
					standing.getPositions().add(pos);
				}
				season.setStanding(standing);
				
				competition.setCurrentSeason(season);
				
				// As of here we preparing to save the model content

		        // Register the XMI resource factory for the .xmi extension
		        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		        Map<String, Object> m = reg.getExtensionToFactoryMap();
		        m.put("xmi", new XMIResourceFactoryImpl());

		        // Obtain a new resource set
		        ResourceSet resSet = new ResourceSetImpl();

		        // create a resource
		        Resource resource = resSet.createResource(URI.createURI("sample/sample.xmi"));
		        
		        // Get the first model element and cast it to the right type, in my
		        // example everything is hierarchical included in this first node
		        resource.getContents().add(competition);

		        // now save the content.
		        try {
		            resource.save(Collections.EMPTY_MAP);
		        } catch (IOException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		        
			} catch (IOException e) {
			    e.printStackTrace();
			}
			
			
			
			
			
			
		
    }
}

