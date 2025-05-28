class Test2<T> {
    T a, b;

    public Test2(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        System.out.println("Before Swap:");
        show();
        T c = a;
        a = b;
        b = c;
        System.out.println("After swap:");
        show();
    }

    public void show() {
        System.out.println("a:" + a + ",b:" + b);
    }
}

public class GenTest2 {
    public static void main(String[] args) {
        Test2<Integer> ob1 = new Test2<>(10, 20);
        Test2<String> ob2 = new Test2<>("Hello", "Bye");
        ob1.swap();
        ob2.swap();
    }
}
