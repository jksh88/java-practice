public class Main {
    public static void main(String[] args) {
        Infinity myGFifty = new Infinity(50000, true, "LA", true, 140, "white", false, "Nissan");
        System.out.println("He bought a " + "$" + myGFifty.getPrice() + " " + myGFifty.getColor() + " car " + "from " + myGFifty.getManufacturer() + " in " + myGFifty.getArea());
    }
}
