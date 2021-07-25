// get largest prime factor of a given number;

import java.util.ArrayList;

public class LargestPrime {
    private static ArrayList<Integer> factors = new ArrayList<>();

    private static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 2) {
            return 2;
        }
        int maxPrime = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
                factors.add(i);
//                System.out.println("i: " + i);
//                System.out.println(factors.get(i-2));
            } else {
                continue;
            }
        }
        factors.forEach(e -> System.out.println(e));
        for (int j = 0; j < factors.size(); j++) {
            for (int k = 2; k <= j; k++) {
                if (factors.get(j) % k == 0) {
                    factors.remove(j);
                }
            }
        }
        return factors.get(factors.size() - 1);
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(10));
//        System.out.println(getLargestPrime(217));
//        System.out.println(getLargestPrime(0));
//        System.out.println(getLargestPrime(45));
//        System.out.println(getLargestPrime(-1));
    }
}