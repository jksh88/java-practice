

public class Main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(27.5, 40);
        double estimate = new TotalEstimate(floor, carpet).getTotalCost();
        System.out.println(estimate);
    }
}
