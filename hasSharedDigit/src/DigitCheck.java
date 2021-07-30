public class DigitCheck {

    public static boolean hasSharedDigit(int first, int second) {
        if (first > 99 || second > 99 || first < 10 || second < 10) {
            return false;
        } else {
            int first2 = first % 10;
            char strFirst2 = Character.forDigit(first2, 10);
            int first1 = (int) Math.floor(first / 10);
            char strFirst1 = Character.forDigit(first1, 10);
            String strSecond = Integer.toString(second);
            for (int i = 0; i < strSecond.length(); i++) {
                if ((strSecond.charAt(i) == strFirst2) || (strSecond.charAt(i) == strFirst1)) {
                    return true;
                }
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = hasSharedDigit(11, 5);
        System.out.println(result);
    }
}
