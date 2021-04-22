import java.sql.SQLOutput;

public class First {
    public static void main(String[] args) {
        System.out.println("First Java");

        int myFirstNumber = 11 + 4 + 2 * 10;
        System.out.println(myFirstNumber + 5);

        int mySecondNumber = 12;
        System.out.println(mySecondNumber + myFirstNumber);

        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
