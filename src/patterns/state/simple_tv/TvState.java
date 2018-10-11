package patterns.state.simple_tv;

/**
 * Created by wuyue on 2018/10/11.
 */
public interface TvState {
    void nextChannel();

    void preChannel();

    void turnUp();

    void turnDown();

}
