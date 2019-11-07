package fetch;

import java.io.IOException;

import fetch.Mapper;

public class Main {
	
	private static final String COMPETITION_URL = "file:data/competitionPL.json";
	private static final String TEAMS_URL = "file:data/teamsPL.json";
	private static final String MATCHES_URL = "file:data/matchesPL.json";
	private static final String STANDINGS_URL = "file:data/standingsPL.json";
	
	private static final String COMPETITION_URL_API = "https://api.football-data.org/v2/competitions/2021";
	private static final String MATCHES_URL_API = "https://api.football-data.org/v2/competitions/2021/matches";
	private static final String TEAMS_URL_API = "https://api.football-data.org/v2/competitions/2021/teams";
	private static final String STANDINGS_URL_API = "https://api.football-data.org/v2/competitions/2021/standings";

	public static void main(String[] args) {
		ApiFetcher fetcher = new ApiFetcher(COMPETITION_URL_API, MATCHES_URL_API, TEAMS_URL_API, STANDINGS_URL_API);
		fetcher.fetchAllData();
		
		// Init mapper and build model. Map from JSON to Ecore model
		//Mapper mapper = new Mapper(COMPETITION_URL, TEAMS_URL, MATCHES_URL, STANDINGS_URL);
		//mapper.buildModel();
		
		// Print data
		//mapper.toString();
	}

}
