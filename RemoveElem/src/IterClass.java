import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterClass {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();

        strList.add("America");
        strList.add("Europe");
        strList.add("Asia");
        strList.add("Africa");

        strList.remove(3);

        Iterator<String> it = strList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
