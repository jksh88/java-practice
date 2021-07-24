import java.lang.Math;

public class LastDigitRemainder {
    public static void getLastDigitRemainder(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int lastDigit = number % 10;
        if (lastDigit == 0) {
            System.out.print("Zero");
        } else if (lastDigit == 1) {
            System.out.print("One");
        } else if (lastDigit == 2) {
            System.out.print("Two");
        } else if (lastDigit == 3) {
            System.out.print("Three");
        } else if (lastDigit == 4) {
            System.out.print("Four");
        } else if (lastDigit == 5) {
            System.out.print("Five");
        } else if (lastDigit == 6) {
            System.out.print("Six");
        } else if (lastDigit == 7) {
            System.out.print("Seven");
        } else if (lastDigit == 8) {
            System.out.print("Eight");
        } else if (lastDigit == 9) {
            System.out.print("Nine");
        }
        if (number < 10) {
            return;
        }
        System.out.println(", ");
        number = (int) Math.floor(number / 10);
        getLastDigitRemainder(number);
    }

    public static void main(String[] args) {
        getLastDigitRemainder(2378);
    }

}
