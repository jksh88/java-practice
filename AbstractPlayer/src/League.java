import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String leagueName;
    private ArrayList<T> league = new ArrayList<>();
    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public boolean addTeam(T team) {
        if(league.contains(team)) {
            System.out.println("team is already in leagueTable");
            return false;
        }
        System.out.println("team " + team.getTeam() + " added");
        return true;
    }

    public void printLeagueTable(){
        Collections.sort(league);
        for(T team: league) {
            System.out.println(team.getTeam( ) + ": " + team.ranking());
        }
    }
}
