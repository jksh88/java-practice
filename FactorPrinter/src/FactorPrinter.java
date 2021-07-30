import java.util.ArrayList;

public class FactorPrinter {
    static ArrayList<Integer> factors = new ArrayList<>();
    private static void printFactors(int num) {
        if (num < 0) {
            System.out.println(-1);
            return;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        factors.forEach(number -> System.out.println(number));
    }

    public static void main(String[] args) {
        printFactors(0);
    }
}
