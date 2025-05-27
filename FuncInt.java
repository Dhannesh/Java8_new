@FunctionalInterface
interface A {
    void hello();
}

interface B {
    void hello();
    void bye();
}

public class FuncInt {
    public static void main(String[] args) {
        B obj = new B() {
            public void hello() {
                System.out.println("Hello");
            }

            public void bye() {
                System.out.println("bye");
            }
        };
        obj.hello();
        obj.bye();
        A oba = () -> {
            System.out.println("Hello from A");
        };
        oba.hello();
    }
}
