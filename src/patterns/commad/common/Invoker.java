package patterns.commad.common;

/**
 * Created by wuyue on 2018/10/17.
 */
public class Invoker {
    private Command command ; // 只有一个对命令对象的引用

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        // 调用具体命令对象的相关方法，执行具体命令
        command.excute();
    }
}
