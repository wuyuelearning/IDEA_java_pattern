package patterns.bridge.simple;

/**
 * Created by wuyue on 2018/12/27.
 */
public class SmallCoffee extends Coffee {

    public SmallCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的"+coffeeAdditives.addSomething()+"咖啡");
    }
}
