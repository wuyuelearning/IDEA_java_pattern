package patterns.bridge.simple;

/**
 * Created by wuyue on 2018/12/27.
 */
public abstract  class Coffee {
    public CoffeeAdditives  coffeeAdditives ;

    public Coffee(CoffeeAdditives coffeeAdditives ){
        this.coffeeAdditives =coffeeAdditives;
    }
    /**
     *  咖啡具体大小由子类决定
     */
    public abstract void makeCoffee();
}
