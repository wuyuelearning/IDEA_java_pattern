package patterns.responsibility.common;

/**
 * Created by wuyue on 2018/10/12.
 */
public class Handler3 extends AbstrctHandler {

    @Override
    int getHandleLevel() {
        return 3;
    }

    @Override
    void handle(AbstrctRequest requesr) {
        System.out.println("Handler3 handle request: "+requesr.getRequestLevel());
    }
}
