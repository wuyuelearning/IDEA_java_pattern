package patterns.decorator.common;

/**
 * Created by wuyue on 2018/11/29.
 */
public class Client {
    public static void main(String[] args){
        Component component =new ConcreteComponent();

        Component a =new Component() {
            @Override
            public void operate() {
                System.out.println("AAAAAAA");
            }
        };
        a.operate();

        Decorator decorator1 =new ConcreteDecoratorA(component);
        decorator1.operate();

        Decorator decorator2 =new ConcreteDecoratorB(component);
        decorator2.operate();

        Decorator2  decorator21  = new Decorator2(component);
        decorator21.operate();

    }
}
