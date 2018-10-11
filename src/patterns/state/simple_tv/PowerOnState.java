package patterns.state.simple_tv;

/**
 * Created by wuyue on 2018/10/11.
 */
public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("nextChannel");
    }

    @Override
    public void preChannel() {
        System.out.println("preChannel");
    }

    @Override
    public void turnUp() {
        System.out.println("turnUp");
    }

    @Override
    public void turnDown() {
        System.out.println("turnDown");
    }
}
