//static method can't be overriden
interface A {
    static void hello() {
        System.out.println("I am hello");
    }
}

class B implements A {
    public static void hello() {
        System.out.println("I can't override");
    }
}

public class StatInt {
    public static void main(String[] args) {
        B obj = new B();
        obj.hello();
        B.hello();
        A.hello();
    }
}
