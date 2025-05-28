import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTester {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramesh", "Suresh", "Mahesh");

        Stream<String> temp = names.stream();

        temp.forEach(s -> System.out.println(s));
        // can't reuse
        // temp.forEach(s -> System.out.println(s));
    }
}
