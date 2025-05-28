class Test {
    int a, b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        System.out.println("Before Swap:");
        show();
        int c = a;
        a = b;
        b = c;
        System.out.println("After swap:");
        show();
    }

    public void show() {
        System.out.println("a:" + a + ",b:" + b);
    }
}

public class GenTester {
    public static void main(String[] args) {
        Test ob1 = new Test(10, 20);
        ob1.swap();
    }
}
