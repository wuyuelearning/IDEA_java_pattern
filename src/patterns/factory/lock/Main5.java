package patterns.factory.lock;

/**
 * Created by wuyue on 2019/1/9.
 */
public class Main5 implements Runnable {
    static Main5 main51 =new Main5();
    static Main5 main52
            =new Main5();
    @Override
    public void run() {
        method();
    }

    private static synchronized void method (){
        System.out.println("我是类锁的代码块形式。我的名字是："
                + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(main51);
        Thread thread2 = new Thread(main52);
        thread1.start();
        thread2.start();
        while(thread1.isAlive()||thread2.isAlive()){

        }
        System.out.println("finish");
    }
}
