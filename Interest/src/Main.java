public class Main {
    public static void main(String[] args) {
        calculateInterest(10000);


    }
    private static void calculateInterest(float amount) {
        for(int i = 2; i < 9; i++) {
            System.out.println(String.format("%.1f", amount * i / 100));
        }
        for(int j = 8; j >= 2; j--) {
            System.out.println(String.format("%.1f", amount * j / 100));
        }
    }
}
