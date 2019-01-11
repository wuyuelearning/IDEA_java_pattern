package patterns.factory.lock;

/**
 * Created by wuyue on 2019/1/9.
 * 自定义锁对象
 */
public class Main2 implements Runnable {

    Object lock1 =new Object();
    Object lock2 =new Object();

    static Main2 main =new Main2();

    @Override
    public void run() {

        synchronized (lock1) {
            System.out.println("我是lock1部分，我叫"
                    + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行结束");
        }


        synchronized (lock2) {
            System.out.println("我是lock2部分，我叫"
                    + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行结束");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(main);
        Thread thread2 = new Thread(main);
        thread1.start();
        thread2.start();
       while (thread1.isAlive() || thread2.isAlive()){}
        System.out.println("finish");
    }
}
