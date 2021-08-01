import java.util.Scanner;

public class MaxElem {

    Scanner size = new Scanner(System.in);
    int length = size.nextInt();

    public int[] readInteger(int len) {
        int[] numArr = new int[len];
        return numArr;
    }

    public int[] readElements(int[] finalArr) {
        for (int i = 0; i < finalArr.length; i++) {
            System.out.println("Input your number: ");
            Scanner input = new Scanner(System.in);

            finalArr[i] = input.nextInt();
        }
        return finalArr;
    }

    public int findMax(int[] givenArr) {
        int max = givenArr[0];
        for (int j = 0; j < givenArr.length; j++) {
            if (givenArr[j] > max) {
                max = givenArr[j];
            } else {
                continue;
            }
            ;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("How many numbers? :");

        MaxElem obj = new MaxElem();

        int[] containerArr = obj.readInteger(obj.length);
        int max = obj.findMax(obj.readElements(containerArr));
        System.out.println("Max: " + max);
    }

}
