package patterns.responsibility.common;

/**
 * Created by wuyue on 2018/10/12.
 */
public class Request2 extends AbstrctRequest {
    public Request2(Object o) {
        super(o);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }
}
