package fetch;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ApiFetcher {
	private static final String TOKEN = "a846dade319c414aae66fe002ef089cd";
	
	private String competitionUrl;
	private String matchesUrl;
	private String standingsUrl;
	private String teamsUrl;
	
	public ApiFetcher(String competitionUrl, String matchesUrl, String standingsUrl, String teamsUrl) {
		this.competitionUrl = competitionUrl;
		this.matchesUrl = matchesUrl;
		this.standingsUrl = standingsUrl;
		this.teamsUrl = teamsUrl;
	}
	
	private String fetchData(String url) throws MalformedURLException, IOException {
		
		URLConnection connection = null;
		Scanner scanner = null;
		String responseBody = "";
			connection = new URL(url).openConnection();
			connection.setRequestProperty("Accept-Charset", "UTF-8");
			connection.setRequestProperty("X-Auth-Token", TOKEN);
			
			InputStream response = connection.getInputStream();
			scanner = new Scanner(response);
			responseBody = scanner.useDelimiter("\\A").next();	
			scanner.close();

		return responseBody;
	}
	
	private void fetchAllData() {
		// Send request
				try {
					String competitionResponse = fetchData(competitionUrl);
					String matchesResponse = fetchData(matchesUrl);
					String teamsResponse = fetchData(teamsUrl);
					String standingResponse = fetchData(standingsUrl);
					
					// Write response to file
					FileWriter competitionFile = new FileWriter("data/competitionPL.json");
					FileWriter matchesFile = new FileWriter("data/matchesPL.json");
					FileWriter standingFile = new FileWriter("data/standingPL.json");
					FileWriter teamsFile = new FileWriter("data/teamsPL.json");
					
					competitionFile.write(competitionResponse);
					matchesFile.write(matchesResponse);
					standingFile.write(standingResponse);
					teamsFile.write(teamsResponse);
			    } catch (Exception E) {
			        E.printStackTrace();
			    } finally {
			    	competitionFile.flush();
			    	competitionFile.close();
			    	matchesFile.flush();
			    	matchesFile.close();
			    	standingFile.flush();
			    	standingFile.close();
			    	teamsFile.flush();
			    	teamsFile.close();
			    }
	}

	public static void main(String[] args) throws MalformedURLException, IOException {
		// Url definitions, 2021 is competition ID for Premier League
		String competitionUrl = "https://api.football-data.org/v2/competitions/2021";
		String matchesUrl = "https://api.football-data.org/v2/competitions/2021/matches";
		String standingUrl = "https://api.football-data.org/v2/competitions/2021/standings";
		String teamsUrl = "https://api.football-data.org/v2/competitions/2021/teams";
		
		// Send request
		String competitionResponse = fetchData(competitionUrl);
		String matchesResponse = fetchData(matchesUrl);
		String teamsResponse = fetchData(teamsUrl);
		String standingResponse = fetchData(standingUrl);
		
		// Write response to file
		FileWriter competitionFile = new FileWriter("data/competitionPL.json");
		FileWriter matchesFile = new FileWriter("data/matchesPL.json");
		FileWriter standingFile = new FileWriter("data/standingPL.json");
		FileWriter teamsFile = new FileWriter("data/teamsPL.json");
		
		try {
			competitionFile.write(competitionResponse);
			matchesFile.write(matchesResponse);
			standingFile.write(standingResponse);
			teamsFile.write(teamsResponse);
	    } catch (Exception E) {
	        E.printStackTrace();
	    } finally {
	    	competitionFile.flush();
	    	competitionFile.close();
	    	matchesFile.flush();
	    	matchesFile.close();
	    	standingFile.flush();
	    	standingFile.close();
	    	teamsFile.flush();
	    	teamsFile.close();
	    }
		
	}

}
