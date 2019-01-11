package patterns.factory.lock;

/**
 * Created by wuyue on 2019/1/9.
 */
public class Main implements Runnable {
    static Main main = new Main();
    static int num = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            num++;
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread thread1 =new Thread(main);
        Thread thread2 =new Thread(main);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(num);
    }
}
