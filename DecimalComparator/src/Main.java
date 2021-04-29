public class Main {
    public static void main(String[] args) {
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.2214, 3.2215));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(0.00002214, 0.00002215));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(0.2214, 0.3275));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(1.2394, 1.2385));
    }
}
