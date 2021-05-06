import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
      int[] exArray = getIntegers(5);
      for (int elem : exArray) {
          System.out.println(elem);
      }
      System.out.println("Average is " + getAverage(exArray));
  }

  public static int[] getIntegers(int number) {
      System.out.println("Enter " + number + " integer values.\n");
      int[] values = new int[number];

      for (int i = 0; i < values.length; i++) {
          values[i] = scanner.nextInt();
      }
      return values;
  }

  public static double getAverage(int[] array) {
      int sum = 0;
      for (int num: array) {
          sum += num;
      }
      return (double)sum / (double)array.length;
  }
}
