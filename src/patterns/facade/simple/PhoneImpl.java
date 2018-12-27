package patterns.facade.simple;

/**
 * Created by wuyue on 2018/12/27.
 */
public class PhoneImpl implements IPhone {
    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }
}
