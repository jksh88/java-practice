public class Main {
    public static void main(String[] args) {
        printEqual(11, 2, -20);
        printEqual(1, 2, 20);
        printEqual(11, 42, 11);
        printEqual(5, 5, 5);
    }
    private static void printEqual(int first, int second, int third) {
        if (first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
        }
        else if (first == second && second == third) {
            System.out.println("All numbers are equal");
        }
        else if (first != second && second != third && third != first) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}
