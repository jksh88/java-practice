public class Player {
    private String name;
    private int energy;
    private String weapon;

    public Player(String name, int energy, String weapon) {
        this.name = name;
        this.energy = energy;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.energy = this.energy - damage;
        if (this.energy <= 0) {
        System.out.println("Player out");}
    }

    public int healthRemaining() {
        return this.energy;
    }
}
