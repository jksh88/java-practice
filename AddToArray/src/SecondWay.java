import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondWay {
    public static Integer[] addUsingArrayList(Integer[] origArr, int elem) {
//        List interimArrayList = new ArrayList<>(Arrays.asList(origArr));
List<Integer> interimArrayList = new ArrayList<>(Arrays.asList(origArr));
interimArrayList.add(elem);
Integer[] newArr = interimArrayList.toArray(origArr);
return newArr;
    }

    public static void main(String[] args) {
        Integer[] testArr = new Integer[] {11, 22, 33};
        Integer[] outputArr = addUsingArrayList(testArr, 88);

        for(Integer e : outputArr) {
            System.out.println(e);
        }
    }
}
