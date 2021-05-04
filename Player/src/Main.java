public class Main {
    public static void main(String[] args) {
        Player player = new Player("Mark", 100, "kicks");
        player.loseHealth(35);
        System.out.println(player.healthRemaining());
    }


}
