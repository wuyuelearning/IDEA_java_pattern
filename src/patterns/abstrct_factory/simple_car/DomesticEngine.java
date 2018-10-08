package patterns.abstrct_factory.simple_car;

/**
 * Created by wuyue on 2018/10/8.
 */
public class DomesticEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("国产发动机");
    }
}
