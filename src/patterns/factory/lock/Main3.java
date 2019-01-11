package patterns.factory.lock;

/**
 * Created by wuyue on 2019/1/9.
 * 方法锁
 */
public class Main3 implements Runnable {
    static Main3 main = new Main3();
    @Override
    public void run() {
        method();
    }

    private synchronized void method(){
        System.out.println("对象锁，我的名字是"+Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"运行结束");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(main);
        Thread thread2 = new Thread(main);
        thread1.start();
        thread2.start();
        while(thread1.isAlive()||thread2.isAlive()){

        }
        System.out.println("finish");
    }
}

