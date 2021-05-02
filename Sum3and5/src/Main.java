public class Main {
    public static void main(String[] args) {
        sum3and5(1000);
    }

    private static void sum3and5(int num) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if(i % 15 == 0 && count !=5) {
                count++;
                sum += i;
                System.out.println(i);
            }
            if (count == 5) {
                System.out.println(sum);
                break;
            }
        }
    }
}
