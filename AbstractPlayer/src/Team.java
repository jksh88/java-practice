import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int loss = 0;
    int draw = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getTeam() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)) {
            System.out.println(((Player) player).getName() + " already on team");
        } else {
            members.add(player);
            System.out.println(((Player) player).getName() + " has been added to Team " + this.name);
        }
        return true;
    }

    public int numPlayers() {
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            draw++;
            message = " drew with ";
        } else {
            loss++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
            System.out.println(this.getTeam() + message + opponent.getTeam() + '.' );
        }
    }

    public int ranking() {
        return (won * 2) + draw;
    }

    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
