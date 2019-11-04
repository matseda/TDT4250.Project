package fetch;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ApiFetch {

	public static void main(String[] args) throws MalformedURLException, IOException {
		String url = "https://api.football-data.org/v2/competitions/2021";
		
		URLConnection connection = new URL(url).openConnection();
		connection.setRequestProperty("Accept-Charset", "UTF-8");
		connection.setRequestProperty("X-Auth-Token", "a846dade319c414aae66fe002ef089cd");
		InputStream response = connection.getInputStream();
		
		try (Scanner scanner = new Scanner(response)) {
		    String responseBody = scanner.useDelimiter("\\A").next();
		    System.out.println(responseBody);
		}
	}

}
