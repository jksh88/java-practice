import java.util.ArrayList;

public class Gearbox {
        private ArrayList<Gear> gears;
        private int maxGears;
        private int currentGear = 0;
        private boolean clutchIn;

        public Gearbox(int maxGears) {
            this.maxGears = maxGears;
            this.gears = new ArrayList<>();
            Gear neutral = new Gear(0, 0.0);
            this.gears.add(neutral);
        }

    public void operateClutch(boolean in) {
            this.clutchIn = in;
    }

    public void addGear (int number, double ratio) {
            if ((number > 0) && (number <= maxGears)) {
                this.gears.add(new Gear(number, ratio));
            }
    }

    public void changeGear(int newGear) {
            if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIn) {
                this.currentGear = newGear;
                System.out.println("Gear " + newGear + " selected");
            } else {
                System.out.println("Not working");
                this.currentGear = 0;
            }
    }

    public double wheelSpeed(int revs) {
            if (clutchIn) {
                System.out.println("Buxing");
                return 0.0;
            }
            return revs * gears.get(currentGear).getRatio();
    }

    public void printGears() {

        System.out.println(gears);
    }



    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio(){
          return ratio;
        }

    }
}
