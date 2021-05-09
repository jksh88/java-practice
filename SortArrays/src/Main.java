import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myInts = getIntegers(5);
        sortArr(myInts);
        printArray(myInts);

    }
    private static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = new int[capacity];
        System.out.println("Enter " + capacity + " integers: \n");
        for (int i = 0; i < inputArr.length ; i++) {
            inputArr[i] = scanner.nextInt();
        }
        return inputArr;
    }

    private static void sortArr(int[] array) {
        int temp;
        for(int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                sortArr(array);
            }
        }
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
