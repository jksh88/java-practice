import java.util.ArrayList;
import java.util.List;

public class NonIterClass {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.remove(2);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
            ;
        }
    }
}
