package patterns.decorator.common;

/**
 * Created by wuyue on 2018/11/29.
 */
public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();
        super.operate();
        operateB();
    }

    private void operateA(){
        System.out.println("ConcreteDecoratorA operateA");
    }


    private void operateB(){
        System.out.println("ConcreteDecoratorA operateB");
    }
}
