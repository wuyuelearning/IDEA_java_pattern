package patterns.responsibility.common;

/**
 * Created by wuyue on 2018/10/12.
 */
public class Handler1 extends AbstrctHandler {
    @Override
    int getHandleLevel() {
        return 1;
    }

    @Override
    void handle(AbstrctRequest requesr) {
        System.out.println("Handler1 handle request: "+requesr.getRequestLevel());
    }
}
