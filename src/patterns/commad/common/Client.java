package patterns.commad.common;

/**
 * Created by wuyue on 2018/10/17.
 */
public class Client {
    public static void main(String[] args) {
        // 构建一个接收者对象
        Receiver receiver = new Receiver();

        // 根据接收者对象构造一个命令对象
        Command c = new ConcreteCommand(receiver);

        //  根据命令着对象构造请求者对象
        Invoker invoker = new Invoker(c);

        // 执行具体方法
        invoker.action();
    }




}
