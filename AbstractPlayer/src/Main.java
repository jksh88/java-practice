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
        Team<SoccerPlayer> osaka = new Team("gambaOsaka");
        Team<SoccerPlayer> sereso = new Team("seresoOsaka");
        Team<SoccerPlayer> tokyo = new Team("fCTokyo");
        Team<SoccerPlayer> barcelona = new Team("fCBarcelona");
        Team<SoccerPlayer> madrid = new Team("realMadrid");
        Team<BaseballPlayer> angels = new Team("laAngels");
        Team<BaseballPlayer> pirates = new Team("pittsburgPirates");
        Team<BaseballPlayer> blueJays = new Team("torontoBlueJays");
        Team<BaseballPlayer> yankees = new Team("nyYankees");
        Team<BaseballPlayer> dodgers = new Team("laDodgers");
        Team<BaseballPlayer> rangers = new Team("texasRangers");
        Team<TennisPlayer> spain = new Team("NadalTeam");
        Team<TennisPlayer> swiss = new Team("FedererTeam");
        suwon.matchResult(seoul, 1, 3);
        suwon.matchResult(barcelona, 1, 3);
        seoul.matchResult(madrid, 4, 1);
        angels.matchResult(la, 6, 4);
        spain.matchResult(swiss, 3, 2);

        System.out.println("Rankings");
        System.out.println();

        League<Team<SoccerPlayer>> kLeague = new League<>("kLeague");
        League<Team<SoccerPlayer>> laLiga = new League<>("laLiga");
        League<Team<SoccerPlayer>> serieA = new League<>("serieA");
        League<Team<SoccerPlayer>> premierLeague = new League<>("premierLeague");
        League<Team<SoccerPlayer>> jLeague = new League<>("jLeague");
        League<Team<BaseballPlayer>> mlb = new League<>("majorLeague");

        jLeague.addTeam(osaka);
        mlb.addTeam(dodgers);
        mlb.addTeam(rangers);
        mlb.addTeam(yankees);
        mlb.addTeam(pirates);
        mlb.addTeam(blueJays);
        jLeague.addTeam(sereso);

        angels.matchResult(dodgers, 4, 7);
        angels.matchResult(pirates, 11, 5);
        angels.matchResult(dodgers, 2, 7);
        angels.matchResult(yankees, 6, 3);
        dodgers.matchResult(rangers, 4, 7);
        blueJays.matchResult(dodgers, 4, 7);
        pirates.matchResult(rangers, 11, 0);

        mlb.printLeagueTable();


    }
}
