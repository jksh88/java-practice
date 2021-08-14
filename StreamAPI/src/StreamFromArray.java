import java.io.IOException;
import java.util.Arrays;

public class StreamFromArray {
    public static void main(String[] args) throws IOException {
        String[] names = {"Joe", "Jane", "Van", "Abbey", "Adam", "May", "Caleb"};
        Arrays.stream(names)
                .filter(elem -> elem.startsWith("V")).sorted().forEach(System.out::println);
    }
}
