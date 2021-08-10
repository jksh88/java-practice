import java.util.ArrayList;

public class TypeTest {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(6);

        printDoubled(items);
    }
    private static void printDoubled(ArrayList<Integer> n) {
        for (Integer i : n) {
            System.out.println(i * 2);
        }
    }
}
