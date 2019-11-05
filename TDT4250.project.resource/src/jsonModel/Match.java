package jsonModel;

import java.util.List;

public class Match {
	public int id;
	public Competition competition;
	public Season season;
	public String utcDate;
	public String status;
	public int minute;
	public int attendance;
	public String venue;
	public int matchday;
	public String stage;
	public String group;
	public String lastUpdated;
	public MatchTeam homeTeam;
	public MatchTeam awayTeam;
	public Score score;
	public List<Referee> referees;
}
