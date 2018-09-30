package patterns.factory.example_factory;

/**
 * Created by wuyue on 2018/9/29.
 */
public class AudiQ7 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q7启动");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q7巡航");
    }
}
