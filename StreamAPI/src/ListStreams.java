import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ListStreams {
    public static void main(String[] args) throws IOException {
        String[] names = new String[] {"Mary", "Bob", "Rob", "Johnny", "James", "Jim", "Ted"};
        List<String> people = Arrays.asList(names);
        people.stream().map(x -> x.toLowerCase()).filter(x -> x.startsWith("j")).sorted().forEach(x -> System.out.println(x + " "));
    }
}
