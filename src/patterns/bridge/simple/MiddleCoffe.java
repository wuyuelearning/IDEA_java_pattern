package patterns.bridge.simple;

/**
 * Created by wuyue on 2018/12/27.
 */
public class MiddleCoffe extends Coffee {
    public MiddleCoffe(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("中杯的"+coffeeAdditives.addSomething()+"咖啡");
    }
}
