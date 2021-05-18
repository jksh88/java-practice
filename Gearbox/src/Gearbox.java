import java.util.ArrayList;

public class Gearbox {
        private ArrayList<Gear> gears;
        private int maxGears;
        private int currentGear = 0;
        private boolean clutchIsIn;

        public Gearbox(int maxGears) {
            this.maxGears = maxGears;
            this.gears = new ArrayList<>();
            Gear neutral = new Gear(0, 0.0);
            this.gears.add(neutral);
        }

        public void operateClutch(boolean in) {
            this.clutchIsIn = in;
        }


    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
    }
}
