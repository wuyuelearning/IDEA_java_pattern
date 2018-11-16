package patterns.adapter.to_class;

/**
 * Created by wuyue on 2018/11/14.
 */
public class VoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() {
        return 5;
    }
}
