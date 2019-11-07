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
	
	private static final String COMPETITION_URL = "https://api.football-data.org/v2/competitions/2021";
	private static final String MATCHES_URL = "https://api.football-data.org/v2/competitions/2021/matches";
	private static final String STANDINGS_URL = "https://api.football-data.org/v2/competitions/2021/standings";
	private static final String TEAMS_URL = "https://api.football-data.org/v2/competitions/2021/teams";
	
	private String competitionFileUrl;
	private String matchesFileUrl;
	private String standingsFileUrl;
	private String teamsFileUrl;
	
	public ApiFetcher(String competitionFile, String matchesFile, String standingsFile, String teamsFile) {
		this.competitionFileUrl = competitionFile;
		this.matchesFileUrl = matchesFile;
		this.standingsFileUrl = standingsFile;
		this.teamsFileUrl = teamsFile;
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
		try {
			// Send request
			String competitionResponse = fetchData(COMPETITION_URL);
			String matchesResponse = fetchData(MATCHES_URL);
			String teamsResponse = fetchData(TEAMS_URL);
			String standingsResponse = fetchData(STANDINGS_URL);

			// Write response to file
			FileWriter competitionFile = new FileWriter(competitionFileUrl);
			FileWriter matchesFile = new FileWriter(matchesFileUrl);
			FileWriter standingsFile = new FileWriter(standingsFileUrl);
			FileWriter teamsFile = new FileWriter(teamsFileUrl);
			
			try {
				competitionFile.write(competitionResponse);
				matchesFile.write(matchesResponse);
				standingsFile.write(standingsResponse);
				teamsFile.write(teamsResponse);
		    } catch (Exception E) {
		    	System.out.println("Error writing file");
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
		    }
		} catch (MalformedURLException e) {
			System.out.println("Error creating URL");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error creating FileWriter");
			e.printStackTrace();
		}
	}
}
