package patterns.responsibility.common;

/**
 * Created by wuyue on 2018/10/12.
 */
public abstract class AbstrctHandler {

    public AbstrctHandler nextHandler;

    /**
     * 处理请求
     */
    public final void handleRequest(AbstrctRequest request) {
        //  判断当前处理对象的处理级别是否与请求者的级别一致
        if (getHandleLevel() == request.getRequestLevel()) {
            handle(request);
        } else {
            // 否则将请求传递到下一个节点
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                System.out.println("All of hanlder can not handle the request");
            }
        }
    }

    /**
     *  获取 处理对象的处理级别
     */
    abstract int getHandleLevel();

    /**
     *  每个处理者对象的具体处理方式
     */
    abstract void handle(AbstrctRequest requesr);
}
