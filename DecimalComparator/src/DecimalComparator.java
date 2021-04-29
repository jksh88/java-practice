public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double numOne, double numTwo) {
        int first = (int)(numOne * 1000);
        int second = (int)(numTwo * 1000);
        if (first == second) {
//            System.out.println(first + " " + second);
            return true;
        }
        return false;
    }
}
