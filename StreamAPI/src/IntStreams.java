import java.io.IOException;
import java.util.stream.IntStream;

public class IntStreams {
    public static void main(String[] args) throws IOException {
        System.out.println(IntStream
                .range(1, 10).skip(5).sum());
    }
}
