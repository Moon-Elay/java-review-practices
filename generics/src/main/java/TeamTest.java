public class TeamTest {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer doe = new SoccerPlayer("Doe");

        Team liverpol= new Team("Liverpool");
        liverpol.addPlayer(joe);
        liverpol.addPlayer(pat);
        liverpol.addPlayer(doe);
        System.out.println(liverpol.numPlayers());
    }
}
