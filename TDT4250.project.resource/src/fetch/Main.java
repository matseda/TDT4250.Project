package fetch;

import fetch.Mapper;

public class Main {
	
	private static final String COMPETITION_URL = "file:data/competition-pl.json";
	private static final String TEAMS_URL = "file:data/teams-pl.json";
	private static final String MATCHES_URL = "file:data/matches-pl.json";
	private static final String STANDINGS_URL = "file:data/standing-pl.json";


	public static void main(String[] args) {
		Mapper mapper = new Mapper();
		
		// Build and 
		mapper.buildModel(COMPETITION_URL, TEAMS_URL, MATCHES_URL, STANDINGS_URL);

	}

}
