import java.util.Arrays;

public class Avg {
    public static void main(String[] args) {
        Arrays.stream(new int[]{2, 3, 6}).map(elem -> elem * elem).average().ifPresent(System.out::println);
    }
}
