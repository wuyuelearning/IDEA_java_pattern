package patterns.abstrct_factory.simple_car;

/**
 * Created by wuyue on 2018/10/8.
 */
public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("普通制动系统");

    }
}
