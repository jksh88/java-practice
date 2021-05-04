public class Main {
    public static void main(String[] args) {
        Dimensions myDimensions = new Dimensions(40, 30, 2);
        Case myCase = new Case("MacBookPro", "Apple", "110", myDimensions);
        Resolution myResolution = new Resolution(2600, 1800);
        Monitor myMonitor = new Monitor("Quad","LG", 49, myResolution);
        MotherBoard myMotherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");
        Computer myComputer = new Computer(myCase, myMonitor, myMotherBoard);
        System.out.println(myComputer.getTheCase());
        myComputer.getMonitor().drawPixelAt(800, 300, "green");
        myComputer.getMotherBoard().loadProgram("Docker");
        myComputer.getTheCase().pressPowerButton();
    }
}
