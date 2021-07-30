import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {
    private static int getGreatestCommonDivisor(int f, int s) {
        if (f < 0 || s < 0) {
            return -1;
        } else if (f == 1 || s == 1) {
            return 1;
        }
        List<Integer> commonDivisorList = new ArrayList<>();
        for (int i = 2; i <= Math.min(f, s); i++) {
            if (f % i == 0 && s % i == 0) {
                commonDivisorList.add(i);
            } else {
                continue;
            }
        }
        if (commonDivisorList.size() == 0) {
            return 1;
        }
        return commonDivisorList.get(commonDivisorList.size() - 1);
    }

    public static void main(String[] args) {
        int gcd = getGreatestCommonDivisor(-90, 15);
        System.out.println(gcd);
    }
}
