import java.util.Scanner;

public class MinInArray {
    private int readInteger() {
        System.out.println("Enter how many numbers to compare: ");
        Scanner scannerLen = new Scanner(System.in);
        int len = scannerLen.nextInt();
        return len;
    }

//    int len = readInteger();

    private int[] readElements(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            Scanner scannerElem = new Scanner(System.in);
            System.out.println("Enter number");
            arr[i] = scannerElem.nextInt();
        }
        System.out.println("array completed");
        return arr;
    }

//    int[] userNums = readElements();

    private int findMin(int[] array) {
        int min = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MinInArray t = new MinInArray();
//        System.out.println(t.readInteger());
        int len = t.readInteger();
        int[] userNums = t.readElements(len);
        int min = t.findMin(userNums);
        System.out.println("Minimum: " + min);
    }
}
