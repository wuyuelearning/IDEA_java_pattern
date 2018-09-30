package patterns.factory.example_factory;

/**
 * Created by wuyue on 2018/9/29.
 * 具体车型
 */
public class AudiQ3  extends AudiCar{
    @Override
    public void drive() {
        System.out.println("Q3启动");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q3巡航");
    }
}
