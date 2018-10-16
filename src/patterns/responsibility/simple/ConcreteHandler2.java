package patterns.responsibility.simple;

/**
 * Created by wuyue on 2018/10/12.
 */
public class ConcreteHandler2 extends Handler {
    @Override
    void handleRequest(String condition) {
        if(("ConcreteHandler2").equals(condition)){
            System.out.println("ConcreteHandler2 Handler");
        } else {
            successor.handleRequest(condition);
        }
    }
}
