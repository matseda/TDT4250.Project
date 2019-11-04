package fetch;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import fetch.Mapper;
import jsonModel.CompetitionM;
import jsonModel.MatchM;
import jsonModel.StandingM;
import jsonModel.TeamM;

public class Main {
	
	private static ObjectMapper objectMapper = new ObjectMapper();
	
	private static void mapper() {
		
		// Initialize object models
	    try {
			CompetitionM competitionM = objectMapper.readValue(new URL("file:data/competition-pl.json"), CompetitionM.class);
			TeamM teamM = objectMapper.readValue(new URL("file:data/teams-pl.json"), TeamM.class);
		    MatchM matchM = objectMapper.readValue(new URL("file:data/matches-pl.json"), MatchM.class);
		    StandingM standingM = objectMapper.readValue(new URL("file:data/standing.json"), StandingM.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
	}

	public static void main(String[] args) {
		Mapper mapper = new Mapper();
		
		// Build and 
		mapper.buildModel();

	}

}
