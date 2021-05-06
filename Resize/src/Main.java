import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[2];

    public static void main(String[] args) {
        System.out.println("Enter 2 integers: ");
        getInput();
        printArray(baseData);
        resizeArray();
//        System.out.println("Enter 3 integers: ");
//        getInput();
//        printArray(baseData);
//        resizeArray();
    }

    public static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void resizeArray() {
        int[] newBaseData = baseData;
        System.out.println("AFTER assignment of baseData to newBaseData, now newBaseData is :");
        printArray(newBaseData);
        System.out.println("old nbd: " + newBaseData + "  old bd: " + baseData + "  old nbd length: " + newBaseData.length + "  old bd length: "  + baseData.length);
        baseData = new int[3];
        System.out.println("post-resize nbd: " + newBaseData + "  post-resize bd: " + baseData + "  post-resize nbd length: " + newBaseData.length + "  post-resize bd length: "  + baseData.length);
        System.out.println("now AFTER baseData has been assigned a whole new array, now newBaseData is :");
        printArray(newBaseData);
        for (int j = 0; j < newBaseData.length; j++) {
            baseData[j] = newBaseData[j];
        }
        System.out.println("finally AFTER the for loop, baseData is :");
        printArray(baseData);
        System.out.println("finally AFTER the for loop, newBaseData is :");
        printArray(newBaseData);


    }
}
