package fetch;

import fetch.Mapper;

public class Main {
	
	private static final String COMPETITION_URL = "file:data/competitionPL.json";
	private static final String TEAMS_URL = "file:data/teamsPL.json";
	private static final String MATCHES_URL = "file:data/matchesPL.json";
	private static final String STANDINGS_URL = "file:data/standingPL.json";
	
	private static final String COMPETITION_URL_API = "https://api.football-data.org/v2/competitions/2021";
	private static final String MATCHES_URL_API = "https://api.football-data.org/v2/competitions/2021/matches";
	private static final String TEAMS_URL_API = "https://api.football-data.org/v2/competitions/2021/teams";
	private static final String STANDINGS_URL_API = "https://api.football-data.org/v2/competitions/2021/standings";

	public static void main(String[] args) {
		// Fetch data from the API
		
		// Init mapper and build model. Map from JSON to Ecore model
		Mapper mapper = new Mapper(COMPETITION_URL, TEAMS_URL, MATCHES_URL, STANDINGS_URL);
		
		// Print data
		mapper.toString();
	}

}
