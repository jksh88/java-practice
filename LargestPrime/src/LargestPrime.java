// get largest prime factor of a given number;
//
//import java.util.ArrayList;

public class LargestPrime {

    private static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 2) {
            return 2;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
                System.out.println("i inner-if scope: " + i + ", number: " + number);
            } else {
                System.out.println("i outer scope: " + i);
                continue;
            }
        }

        return number;
    }

    public static void main(String[] args) {
        getLargestPrime(1000);
//        System.out.println(getLargestPrime(10));
//        System.out.println(getLargestPrime(217));
//        System.out.println(getLargestPrime(0));
//        System.out.println(getLargestPrime(45));
//        System.out.println(getLargestPrime(-1));
    }
}