package fetch;

import java.io.IOException;
import java.net.MalformedURLException;
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

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
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
import json.model.CompetitionM;
import json.model.MatchM;
import json.model.StandingM;
import json.model.TeamM;;


public class Mapper {
	private ObjectMapper objectMapper;
	private CompetitionM competitionM;
	private TeamM teamM;
    private MatchM matchM;
    private StandingM standingM;
	
	public Mapper(String competitionUrl, String matchesUrl, String standingsUrl, String teamsUrl) {
		objectMapper = new ObjectMapper();
		
		// Initialize object models
		try {
			competitionM = objectMapper.readValue(new URL("file:" + competitionUrl), CompetitionM.class);
			matchM = objectMapper.readValue(new URL("file:" + matchesUrl), MatchM.class);
			standingM = objectMapper.readValue(new URL("file:" + standingsUrl), StandingM.class);
			teamM = objectMapper.readValue(new URL("file:" + teamsUrl), TeamM.class);
		} catch (Exception e) {
			System.out.println("Error trying map JSON to model");
			e.printStackTrace();
		}
	}
	
	public void buildModel() {
		System.out.println("Map from JSON to Ecore model...");
	    // Initialize the model
		CompetitionPackage.eINSTANCE.eClass();
		
        // Retrieve the default factory singleton
		CompetitionFactory factory = CompetitionFactory.eINSTANCE;

        // Create the content of the model
		Competition competition = createCompetition(factory);
		Season season = createSeason(factory, competition);
		addTeams(factory, competition);
		addMatchDays(factory, competition, season);
		addStandings(factory, competition, season);
		
		// As of here we preparing to save the model content
        // Register the XMI resource factory for the .xmi extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource in samples project
        Resource resource = resSet.createResource(URI.createURI("../TDT4250.project.samples/sample.xmi"));
        
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(competition);

        // Save the content
        try {
        	System.out.println("Save data .xmi file of data to TDT4250.project.samples/sample.xmi...");
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            System.out.println("Error trying to save the content");
            e.printStackTrace();
        }
        System.out.println("Succesfully updated data!");
	}
	
	private Date parseDate(String date) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		Date parsedDate = null;
		try {
			parsedDate = format.parse(date);
		} catch (ParseException e) {
			System.out.println("Error trying to parse date");
			e.printStackTrace();
		}
		return parsedDate;
	}

	private Competition createCompetition(CompetitionFactory factory) {
		Competition competition = factory.createCompetition();
		competition.setId(competitionM.id);
		competition.setName(competitionM.name);
		competition.setCode(competitionM.code);
		competition.setArea(competitionM.area.name);
		competition.setPlan(competitionM.plan);
		competition.setLastUpdated(parseDate(competitionM.lastUpdated));
		return competition;
	}

	private void addTeams(CompetitionFactory factory, Competition competition) {
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

	private void addStandings(CompetitionFactory factory, Competition competition,
			Season season) {
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
	
	private void addMatchDays(CompetitionFactory factory, Competition competition, Season season) {
		int prevmd = 0;
		for(int i = 0; i < matchM.matches.size(); i++) {
			int md = matchM.matches.get(i).matchday;
			if(md == prevmd + 1) {
				Matchday matchday = factory.createMatchday();
				matchday.setMatchday(md);
				addMatches(factory, competition, matchday);
				season.getMatchdays().add(matchday);
			}
			prevmd = md;
		}
	}
	
	private void addMatches(CompetitionFactory factory, Competition competition, Matchday matchday){
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
	
	private Season createSeason(CompetitionFactory factory, Competition competition) {
		Season season = factory.createSeason();
		season.setId(competitionM.currentSeason.id);
		season.setStartDate(new Date());
		season.setEndDate(new Date());
		season.setCurrentMatchday(competitionM.currentSeason.currentMatchday);
		season.setCompetition(competition);
		return season;
	}
	
	
	
	@Override
	public String toString() {
		String strBuilder = "";
		strBuilder += competitionM.name + ":\n";
	    
	    // Add teams to print string
	    for(int i = 0; i < teamM.teams.size(); i++) strBuilder += teamM.teams.get(i).name + "\n";
	    
	    
	    // Add matches to print string
	    strBuilder += "\nMatches:\n";
	    for(int i = 0; i < matchM.matches.size(); i++) 
	    	strBuilder += matchM.matches.get(i).homeTeam.name + " ----VS---- " + matchM.matches.get(i).awayTeam.name + "\n";
	    
	    // Add standing to print string
	    strBuilder += "\nStanding:\n";
	    for(int i = 0; i < standingM.standings.get(0).table.size(); i++) 
	    	strBuilder += standingM.standings.get(0).table.get(i).position + ": " + standingM.standings.get(0).table.get(i).team.name + "\n";
	    
		return strBuilder;
	}
}

