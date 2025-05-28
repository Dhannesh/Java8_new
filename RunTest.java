
class MyT implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

public class RunTest {
    public static void main(String[] args) {
        // MyT th1 = new MyT();
        // new Thread(th1).run();
        Runnable obj = () -> {
            for (int i = 0; i < 9; i++) {
                System.out.println(i);
            }
        };
        new Thread(obj).run();

    }
}