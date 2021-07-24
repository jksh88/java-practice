public class LastDigitCheck {
    private static boolean hasSameLastDigit(int f, int s, int t) {
        if ((f < 10 || s < 10 || t < 10 || f > 1000 || s > 1000 || t > 1000)) {
            return false;
        } else if ((f % 10) != (s % 10) && (f % 10) != (t % 10) && (s % 10) != (t % 10)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean outcome = hasSameLastDigit(14,44,214);
        System.out.println(outcome);
    }
}
