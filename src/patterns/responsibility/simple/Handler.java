package patterns.responsibility.simple;

/**
 * Created by wuyue on 2018/10/12.
 */
public abstract  class Handler {

    Handler successor ; // 下一节点的处理者

    abstract void  handleRequest(String condition);
}
