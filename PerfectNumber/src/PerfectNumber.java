public class PerfectNumber {
    private static boolean isPerfectNumber(int num) {
        int sum = 0;
        int increment = 0;
        if (num < 1) {
            return false;
        } else {
            increment = (num % 2 == 0) ? 1: 2;
        }

        for (int i = 1; i <= num/2; i += increment ) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return (sum == num);
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }


}
