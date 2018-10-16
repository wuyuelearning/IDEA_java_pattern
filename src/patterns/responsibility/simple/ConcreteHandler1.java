package patterns.responsibility.simple;

/**
 * Created by wuyue on 2018/10/12.
 */
public class ConcreteHandler1 extends Handler {
    @Override
    void handleRequest(String condition) {
        if(("ConcreteHandler1").equals(condition)){
            System.out.println("ConcreteHandler1 Handler");
        } else {
            successor.handleRequest(condition);
        }
    }
}
