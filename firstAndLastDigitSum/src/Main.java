public class Main {
    public static void main(String[] args) {
        System.out.println(firstAndLastDigitSum(-42123));
    }

    public static int firstAndLastDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        return firstDigit + lastDigit;
    }
}
