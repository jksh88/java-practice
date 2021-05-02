public class Main {
    public static void main(String[] args) {
//        sumDigits(128);
        sumDigits(125);
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        String numberString = Integer.toString(number);
//        System.out.println("numberString: " + numberString);
        int sum = 0;
        int i = 0;
        while (i < numberString.length()) {
            int intNumber = Character.getNumericValue(numberString.charAt(i));
            System.out.println("intNum: " + intNumber);
            sum += intNumber;
            i++;
        }
        System.out.println(sum);
        return sum;


    }
}
