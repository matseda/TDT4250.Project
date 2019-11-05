package fetch;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import competition.Matchday;
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


public class Mapper {
	private ObjectMapper objectMapper = new ObjectMapper();
	
	private Date parseDate(String date) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		Date parsedDate = null;
		try {
			parsedDate = format.parse(date);
		} catch (ParseException e) {
			System.out.println("Failed parsing date");
			e.printStackTrace();
		}
		return parsedDate;
	}

	private Competition createCompetition(CompetitionM competitionM, CompetitionFactory factory) {
		Competition competition = factory.createCompetition();
		competition.setId(competitionM.id);
		competition.setName(competitionM.name);
		competition.setCode(competitionM.code);
		competition.setArea(competitionM.area.name);
		competition.setPlan(competitionM.plan);
		competition.setLastUpdated(parseDate(competitionM.lastUpdated));
		return competition;
	}

	private void addTeams(TeamM teamM, CompetitionFactory factory, Competition competition) {
		// Add teams
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
	}

	private void addStandings(StandingM standingM, CompetitionFactory factory, Competition competition,
			Season season) {
		// Add standings
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
			
			for(int j = 0; j < competition.getTeams().size(); j++) 
				if(competition.getTeams().get(j).getId() == standingM.standings.get(0).table.get(i).team.id) 
					pos.setTeam(competition.getTeams().get(j));

			standing.getPositions().add(pos);
		}
		season.setStanding(standing);
		competition.setCurrentSeason(season);
	}
	
	private void addMatchDays(MatchM matchM, CompetitionFactory factory, Competition competition, Season season) {
		int prevmd = 0;
		for(int i = 0; i < matchM.matches.size(); i++) {
			int md = matchM.matches.get(i).matchday;
			if(md == prevmd + 1) {
				Matchday matchday = factory.createMatchday();
				matchday.setMatchday(md);
				addMatches(matchM, factory, competition, matchday);
				season.getMatchdays().add(matchday);
			}
			prevmd = md;
		}
	}
	
	private void addMatches(MatchM matchM, CompetitionFactory factory, Competition competition, Matchday matchday){
		// Add matches
		for(int i = 0; i < matchM.matches.size(); i++) {
			if(matchM.matches.get(i).matchday == matchday.getMatchday()) {
				Match match = factory.createMatch();
				match.setId(matchM.matches.get(i).id);
				match.setStatus(Status.valueOf(matchM.matches.get(i).status));
				match.setLastUpdated(parseDate(matchM.matches.get(i).lastUpdated));
				match.setUtcDate(parseDate(matchM.matches.get(i).utcDate));
				
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
				
				matchday.getMatches().add(match);
			}
			
		}
	}
	
	private Season createSeason(CompetitionM competitionM, CompetitionFactory factory, Competition competition) {
		Season season = factory.createSeason();
		season.setId(competitionM.currentSeason.id);
		season.setStartDate(new Date());
		season.setEndDate(new Date());
		season.setCurrentMatchday(competitionM.currentSeason.currentMatchday);
		season.setCompetition(competition);
		return season;
	}
	
	public void buildModel(String competitionUrl, String teamsUrl, String matchesUrl, String standingUrl) {
		try {
			
			// Initialize object models
		    CompetitionM competitionM = objectMapper.readValue(new URL(competitionUrl), CompetitionM.class);
		    TeamM teamM = objectMapper.readValue(new URL(teamsUrl), TeamM.class);
		    MatchM matchM = objectMapper.readValue(new URL(matchesUrl), MatchM.class);
		    StandingM standingM = objectMapper.readValue(new URL(standingUrl), StandingM.class);
		    
		    // Print teams
		    System.out.print(printTeams(competitionM, teamM, matchM, standingM));
		    
		    // Initialize the model
			CompetitionPackage.eINSTANCE.eClass();
			
	        // Retrieve the default factory singleton
			CompetitionFactory factory = CompetitionFactory.eINSTANCE;

	        // Create the content of the model
			Competition competition = createCompetition(competitionM, factory);
			Season season = createSeason(competitionM, factory, competition);
			addTeams(teamM, factory, competition);
			addMatchDays(matchM, factory, competition, season);
			addStandings(standingM, factory, competition, season);
			
			// As of here we preparing to save the model content
	        // Register the XMI resource factory for the .xmi extension
	        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	        Map<String, Object> m = reg.getExtensionToFactoryMap();
	        m.put("xmi", new XMIResourceFactoryImpl());

	        // Obtain a new resource set
	        ResourceSet resSet = new ResourceSetImpl();

	        // create a resource
	        Resource resource = resSet.createResource(URI.createURI("samples/sample.xmi"));
	        
	        // Get the first model element and cast it to the right type, in my
	        // example everything is hierarchical included in this first node
	        resource.getContents().add(competition);

	        // Save the content
	        try {
	            resource.save(Collections.EMPTY_MAP);
	        } catch (IOException e) {
	            System.out.println("Error trying to save the content");
	            e.printStackTrace();
	        }
	        
		} catch (IOException e) {
			System.out.println("Error trying map JSON to model");
		    e.printStackTrace();
		}
		
	}
	
	public String printTeams(CompetitionM competition, TeamM team, MatchM match, StandingM standing) {
		String strBuilder = "";
		strBuilder += competition.name + ":\n";
	    
	    // Add teams to print string
	    for(int i = 0; i < team.teams.size(); i++) strBuilder += team.teams.get(i).name + "\n";
	    
	    
	    // Add matches to print string
	    strBuilder += "\nMatches:\n";
	    for(int i = 0; i < match.matches.size(); i++) 
	    	strBuilder += match.matches.get(i).homeTeam.name + " ----VS---- " + match.matches.get(i).awayTeam.name + "\n";
	    
	    // Add standing to print string
	    strBuilder += "\nStanding:\n";
	    for(int i = 0; i < standing.standings.get(0).table.size(); i++) 
	    	strBuilder += standing.standings.get(0).table.get(i).position + ": " + standing.standings.get(0).table.get(i).team.name + "\n";
	    
		return strBuilder;
	}
}

