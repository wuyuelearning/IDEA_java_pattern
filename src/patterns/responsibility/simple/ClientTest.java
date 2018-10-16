package patterns.responsibility.simple;

/**
 * Created by wuyue on 2018/10/12.
 */
public class ClientTest {
    public static void main(String[] args){
        ConcreteHandler1 handler1 =new ConcreteHandler1();
        ConcreteHandler2 handler2 =new ConcreteHandler2();

        handler1.successor =handler2;
        handler2.successor = handler1;
        handler1.handleRequest("ConcreteHandler2");

    }
}
