public class Main {
    public static void main(String[] args) {
        Team<BaseballPlayer> baseballTeam = new Team("dodgers");
        BaseballPlayer ryu = new BaseballPlayer("Ryu");
        TennisPlayer joe = new TennisPlayer("Joe");
        SoccerPlayer sam = new SoccerPlayer("Sam");
        baseballTeam.addPlayer(ryu);
        int numBaseballTeam = baseballTeam.numPlayers();
        System.out.println(numBaseballTeam);

        Team<TennisPlayer> tennisTeam = new Team("davisCupTeam");
        tennisTeam.addPlayer(joe);

        Team<SoccerPlayer> suwon = new Team("blueWings");
        Team<SoccerPlayer> seoul = new Team("fCSeoul");

        suwon.matchResult(seoul, 1, 3);

    }
}
