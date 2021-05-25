import java.util.ArrayList;

public class Team {
    private String name;
    int played = 0;
    int won = 0;
    int loss = 0;
    int draw = 0;

    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getTeam() {
        return name;
    }

    public boolean addPlayer(Player player){
        if (members.contains(player)) {
            System.out.println(player.getName() + " already on team");
        } else {
            members.add(player);
            System.out.println(player.getName() + " has been added to Team " + this.name);
        }
        return true;
    }

    public int numPlayers() {
        return members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if(ourScore > theirScore) {
            won++;
        } else if(ourScore == theirScore) {
            draw++;
        } else {
            loss++;
        }
        played++;
        if(opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + draw;
    }
}
