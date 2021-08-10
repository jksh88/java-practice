import java.util.Arrays;

public class ThirdWay {
    public static Integer[] addToArray (Integer[] arr, int num) {
         Integer[] expandedArr = Arrays.copyOf(arr, arr.length + 1);
         expandedArr[arr.length] = num;
         return expandedArr;
    }

    public static void main(String[] args) {
        Integer[] testArr = new Integer[] {11, 33, 55};
        Integer[] newArr = addToArray(testArr, 88);

        for (Integer elem : newArr) {
            System.out.println(elem);
        }
    }
}
