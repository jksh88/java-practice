public class Main {
    public static void main(String[] args) {
        Gearbox sonata = new Gearbox(6);
//        Gearbox.Gear first = sonata.new Gear(3, 5.0);
        sonata.addGear(3, 1.0);
        sonata.operateClutch(true);
        sonata.changeGear(1);
        sonata.wheelSpeed(2000);
        sonata.printGears();

    }
}
