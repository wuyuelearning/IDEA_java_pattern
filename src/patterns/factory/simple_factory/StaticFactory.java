package patterns.factory.simple_factory;

/**
 * Created by wuyue on 2018/9/29.
 * 静态工厂
 */
public class StaticFactory {
    public static Product createProduct() {
        return new ConcreteProductA();
    }
}
