package patterns.commad.common;


/**
 * Created by wuyue on 2018/10/17.
 */
public class Receiver {
    /**
     * 真正执行具体命令逻辑的方法
     */
    public void action(){
        System.out.println("Recevier 执行具体方法");
    }
}
