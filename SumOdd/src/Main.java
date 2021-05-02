public class Main {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 10));
    }
    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        for(int i = start; i <= end; i++) {
            if(isOdd(i)){
                sum += i;
            }
            continue;
        }
        return sum;
    }
}
