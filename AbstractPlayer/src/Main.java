public class Main {
    public static void main(String[] args) {
        Team teamA = new Team("teamA");
        BaseballPlayer ryu = new BaseballPlayer("Ryu");
        TennisPlayer joe = new TennisPlayer("Joe");
        SoccerPlayer sam = new SoccerPlayer("Sam");
        teamA.addPlayer(ryu);
        int numTeamA = teamA.numPlayers();
        System.out.println(numTeamA);
    }
}
