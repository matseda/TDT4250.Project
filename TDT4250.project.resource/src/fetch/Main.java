package fetch;

import fetch.Mapper;

public class Main {
	
	private static final String COMPETITION_FILE = "data/competitionPL.json";
	private static final String MATCHES_FILE = "data/matchesPL.json";
	private static final String STANDINGS_FILE = "data/standingsPL.json";
	private static final String TEAMS_FILE = "data/teamsPL.json";

	public static void main(String[] args) {
		// 
		ApiFetcher fetcher = new ApiFetcher(COMPETITION_FILE, MATCHES_FILE, STANDINGS_FILE, TEAMS_FILE);
		fetcher.fetchAllData();
		
		// Init mapper and build model. Map from JSON to Ecore model
		Mapper mapper = new Mapper(COMPETITION_FILE, MATCHES_FILE, STANDINGS_FILE, TEAMS_FILE);
		mapper.buildModel();
		
		// mapper.toString(); // Print data
	}
}
