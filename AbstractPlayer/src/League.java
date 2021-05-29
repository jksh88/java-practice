import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String teamName;
    private ArrayList<T> league = new ArrayList<>();
    public League(String team) {
        this.teamName = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addTeam(T team) {
        if(league.contains(team)) {
            System.out.println("team is already in leagueTable");
            return false;
        }
        System.out.println("team " + getTeamName() + " added");
        return true;
    }

    public void printLeagueTable(){
        Collections.sort(league);
        for(T team: league) {
            System.out.println(team.getTeam( ) + ": " + team.ranking());
        }
    }
}
