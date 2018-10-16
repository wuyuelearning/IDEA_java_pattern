package patterns.responsibility.common;

/**
 * Created by wuyue on 2018/10/12.
 */
public class Handler2 extends AbstrctHandler {
    @Override
    int getHandleLevel() {
        return 2;
    }

    @Override
    void handle(AbstrctRequest requesr) {
        System.out.println("Handler2 handle request: "+requesr.getRequestLevel());
    }
}
