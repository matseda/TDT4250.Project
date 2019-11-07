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
		URLConnection connection = new URL(url).openConnection();
		connection.setRequestProperty("Accept-Charset", "UTF-8");
		connection.setRequestProperty("X-Auth-Token", TOKEN);
			
		InputStream response = connection.getInputStream();
		Scanner scanner = new Scanner(response);
		String responseBody = scanner.useDelimiter("\\A").next();	
		scanner.close();

		return responseBody;
	}
	
	public void fetchAllData() {
		// Send request
		try {
			String competitionResponse = fetchData(competitionUrl);
			System.out.println("Competition: " + competitionUrl + ", " + competitionResponse);
			String matchesResponse = fetchData(matchesUrl);
			System.out.println("Matches: " + matchesUrl + ", " + matchesResponse);
			String teamsResponse = fetchData(teamsUrl);
			System.out.println("Teams: " + teamsUrl + ", " + teamsResponse);
			String standingsResponse = fetchData(standingsUrl);
			System.out.println("Standings: " + standingsUrl + ", " + standingsResponse);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Write response to file
		/*
		FileWriter competitionFile = new FileWriter("data/competitionPL.json");
		FileWriter matchesFile = new FileWriter("data/matchesPL.json");
		FileWriter standingsFile = new FileWriter("data/standingsPL.json");
		FileWriter teamsFile = new FileWriter("data/teamsPL.json");
		
		try {
			competitionFile.write(competitionResponse);
			matchesFile.write(matchesResponse);
			standingsFile.write(standingsResponse);
			teamsFile.write(teamsResponse);
	    } catch (Exception E) {
	        E.printStackTrace();
	    } finally {
	    	competitionFile.flush();
	    	competitionFile.close();
	    	matchesFile.flush();
	    	matchesFile.close();
	    	standingsFile.flush();
	    	standingsFile.close();
	    	teamsFile.flush();
	    	teamsFile.close();
	    }*/
	}
}
