public class AddEvenDigits {
    public static int addEvenDigits(int number) {
        String numStr = String.valueOf(number);
        int sum = 0;
        for(int i = numStr.length(); i >= 0; i--) {
            System.out.println("number: " + number);
            int digit = (int)(number % 10);
            System.out.println("digit: " + digit);
            if(digit % 2 ==0) {
                sum += digit;
            }
            number /= 10;
            System.out.println("number: " + number);
            System.out.println("sum: " + sum);
        }
        return sum;
    }
}
