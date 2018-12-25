package patterns.decorator.common;

/**
 * Created by wuyue on 2018/11/29.
 */
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();
        super.operate();
        operateB();
    }

    private void operateA(){
        System.out.println("ConcreteDecoratorB operateA");
    }


    private void operateB(){
        System.out.println("ConcreteDecoratorB operateB");
    }
}
