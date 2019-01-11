package patterns.factory.lock;

/**
 * Created by wuyue on 2019/1/9.
 *
 * Class对象锁（锁对象是类名.class）
 */
public class Main4 implements Runnable {
    static Main4 main41 =new Main4();
    static Main4 main42 =new Main4();
    @Override
    public void run() {
        synchronized (Main4.this){
            System.out.println("我是类锁的代码块形式。我的名字是："
                    + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行结束");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(main41);
        Thread thread2 = new Thread(main42);
        thread1.start();
        thread2.start();
        while(thread1.isAlive()||thread2.isAlive()){

        }
        System.out.println("finish");
    }
}
