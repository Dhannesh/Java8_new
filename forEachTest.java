import java.util.Arrays;
import java.util.List;

public class forEachTest {

    public static void print(String s) {
        System.out.println(s);
    }

    public void show(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rashi", "rani", "Vani", "Singh");
        System.out.println("From range based for loop");
        for (String s : names) {
            System.out.println(s);
        }
        System.out.println("From Foreach");
        names.forEach(s -> System.out.println(s));
        System.out.println("From Method Ref");
        names.forEach(forEachTest::print); // static method ref
        forEachTest obj = new forEachTest();
        System.out.println("From method ref non static");
        names.forEach(obj::show); // not static method ref
    }
}
