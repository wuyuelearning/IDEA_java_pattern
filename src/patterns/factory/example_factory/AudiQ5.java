package patterns.factory.example_factory;

/**
 * Created by wuyue on 2018/9/29.
 */
public class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q5启动");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q5巡航");
    }
}
