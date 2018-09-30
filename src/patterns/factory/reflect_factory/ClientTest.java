package patterns.factory.reflect_factory;

/**
 * Created by wuyue on 2018/9/29.
 */
public class ClientTest {
    public static void main(String[] args) {

        Factory factory1 = new ConcreteFactory();
        Product p1 = factory1.createProduct(ConcreteProductA.class);
        p1.medth();

        Factory factory2 = new ConcreteFactory();
        Product p2 = factory2.createProduct(ConcreteProductB.class);
        p2.medth();

    }
}
