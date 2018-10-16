package patterns.responsibility.common;

/**
 * Created by wuyue on 2018/10/12.
 */
public class ClientTest {
    public static void main(String[] args) {

        //  处理者对象
        AbstrctHandler handler1 = new Handler1();
        AbstrctHandler handler2 = new Handler2();
        AbstrctHandler handler3 = new Handler3();

        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;
//        handler3.nextHandler = handler1;

        // 请求者对象
        AbstrctRequest request1 = new Request1("Request1");
        AbstrctRequest request2 = new Request2("Request2");
        AbstrctRequest request3 = new Request3("Request3");

        // 总是从链式的首端发起请求
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler3.handleRequest(request1);

    }
}
