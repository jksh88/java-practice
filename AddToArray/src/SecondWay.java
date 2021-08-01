import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondWay {
    public static int[] addUsingArrayList(int len, int[] origArr, int elem) {
//        List interimArrayList = new ArrayList<>(Arrays.asList(origArr));
List<Integer> interimArrayList = new ArrayList<Integer>(Arrays.asList(origArr));
// Q: why does this not work?
interimArrayList.add(elem);
int[] newArr = interimArrayList.toArray(origArr);

    }
}
