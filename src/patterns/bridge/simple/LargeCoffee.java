package patterns.bridge.simple;

/**
 * Created by wuyue on 2018/12/27.
 */
public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
    System.out.println("大杯的"+coffeeAdditives.addSomething()+"咖啡");
    }
}
