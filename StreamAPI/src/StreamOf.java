import java.io.IOException;
import java.util.stream.Stream;

public class StreamOf {
    public static void main(String[] args) throws IOException {
        Stream.of("Mike", "Alex", "Uriah").sorted().findFirst().ifPresent(System.out::print);
    }
}
