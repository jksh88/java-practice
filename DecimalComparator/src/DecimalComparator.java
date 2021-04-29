public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
        double first = Math.floor(numOne * 1000.0) / 1000.0;
        double second = Math.floor(numTwo * 1000.0) / 1000.0;
        System.out.println(first + ", " + second);
        if (first == second) {
            return true;
        }
        return false;
    }
}
