
interface A {
    default void hello() {
        System.out.println("Hello from A");
    }
}

interface B {
    default void hello() {
        System.out.println("Hello from B");
    }

}

public class Test implements A, B {
    public static void main(String[] args) {
        Test t = new Test();
        t.hello();
    }

    public void hello() {
        System.out.println("I am from main");
        A.super.hello();
        B.super.hello();
    }

}