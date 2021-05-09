import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayToSort = getIntegers(5);
        sortArray(arrayToSort);
        printArray(arrayToSort);
    }

    private static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + capacity + " integers: ");
//        System.out.println("scanner**: " + scanner);
//        System.out.println(scanner);
        int[] input = new int[capacity];
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }
        return input;
    }

    private static int[] sortArray(int[] arr) {
        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
    }
}
