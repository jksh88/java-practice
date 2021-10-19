import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFile {
    public static void main(String[] args) throws IOException {
        String cwd = Paths.get("").toAbsolutePath().toString();
        System.out.println(cwd);
        Stream<String> words = Files.lines(Paths.get("app-requirements-figma-link.txt"));
        words.forEach(System.out::print);
        words.close();
    }
}

