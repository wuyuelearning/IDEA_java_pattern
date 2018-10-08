package patterns.abstrct_factory.simple_car;

/**
 * Created by wuyue on 2018/10/8.
 */
public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
