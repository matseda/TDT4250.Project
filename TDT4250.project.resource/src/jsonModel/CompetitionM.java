package jsonModel;
import java.util.List;

public class CompetitionM {
    public int id;
    public Area area;
    public String name;
    public String code;
    public String emblemUrl;
    public String plan;
    public CurrentSeason currentSeason;
    public List<Season> seasons;
    public String lastUpdated;
}
