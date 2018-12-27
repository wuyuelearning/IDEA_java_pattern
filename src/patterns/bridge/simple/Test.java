package patterns.bridge.simple;

/**
 * Created by wuyue on 2018/12/27.
 */
public class Test {
    public static void main(String[] args){

        Orignary orignary =new Orignary();

        Suger suger =new Suger();

        LargeCoffee largeCoffeeOrignary =new LargeCoffee(orignary);
        largeCoffeeOrignary.makeCoffee();

        LargeCoffee largeCoffeeSuger =new LargeCoffee(suger);
        largeCoffeeSuger.makeCoffee();

        SmallCoffee smallCoffeeOriginary =new SmallCoffee(orignary);
        smallCoffeeOriginary.makeCoffee();

        SmallCoffee smallCoffeeSuger =new SmallCoffee(suger);
        smallCoffeeSuger.makeCoffee();

        MiddleCoffe middleCoffeOridinary =new MiddleCoffe(orignary);
        middleCoffeOridinary.makeCoffee();

        MiddleCoffe middleCoffeSuger =new MiddleCoffe(suger);
        middleCoffeSuger.makeCoffee();

    }
}
