import java.util.Arrays;

public class FirstWay {
    private static int[] addElement(int len, int[] origArr, int num) {
        int[] newArr = new int[len + 1];
        for (int i = 0; i < len; i++) {
            newArr[i] = origArr[i];
        }
        newArr[len] = num;
        return newArr;
    }

    public static void main(String[] args) {
        int[] inputArr = new int[] {22,33,44,55};
        int[] outcomeArr = addElement(4, inputArr, 88);
        System.out.println(Arrays.toString(outcomeArr));
    }
}
