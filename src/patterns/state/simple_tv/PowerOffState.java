package patterns.state.simple_tv;

/**
 * Created by wuyue on 2018/10/11.
 */
public class PowerOffState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("nextChannel--没开机");
    }

    @Override
    public void preChannel() {
        System.out.println("preChannel--没开机");

    }

    @Override
    public void turnUp() {
        System.out.println("turnUp--没开机");

    }

    @Override
    public void turnDown() {
        System.out.println("turnDown--没开机");

    }
}
