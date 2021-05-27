public class Main {
    public static void main(String[] args) {
        Team<BaseballPlayer> la = new Team("dodgers");
        BaseballPlayer ryu = new BaseballPlayer("Ryu");
        TennisPlayer joe = new TennisPlayer("Joe");
        SoccerPlayer sam = new SoccerPlayer("Sam");
        la.addPlayer(ryu);
        int numBaseballTeam = la.numPlayers();
        System.out.println(numBaseballTeam);

        Team<TennisPlayer> tennisTeam = new Team("davisCupTeam");
        tennisTeam.addPlayer(joe);

        Team<SoccerPlayer> suwon = new Team("blueWings");
        Team<SoccerPlayer> seoul = new Team("fCSeoul");
        Team<SoccerPlayer> barcelona = new Team("fCBarcelona");
        Team<SoccerPlayer> madrid = new Team("realMadrid");
        Team<BaseballPlayer> angels = new Team("laAngels");


        suwon.matchResult(seoul, 1, 3);
        suwon.matchResult(barcelona, 1, 3);
        seoul.matchResult(madrid, 4, 1);
        angels.matchResult(la, 6, 4);

        System.out.println("Rankings");
        System.out.println();

    }
}
