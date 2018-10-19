package patterns.observer.simple;

/**
 * Created by wuyue on 2018/10/18.
 */
public class Client {
    public static void main(String[] args){
        // 被观察者
        Observed observed = new Observed();
        // 观察者
        Coder simple= new Coder("simple");
        Coder coder1 = new Coder("coder1");
        Coder coder2 = new Coder("coder2");
        Coder coder3 = new Coder("coder3");

        observed.addObserver(simple);
        observed.addObserver(coder1);
        observed.addObserver(coder2);
        observed.addObserver(coder3);

        observed.notifyCoders("跟新了");
    }
}
