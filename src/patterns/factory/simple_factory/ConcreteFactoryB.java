package patterns.factory.simple_factory;

/**
 * Created by wuyue on 2018/9/29.
 */
public class ConcreteFactoryB extends Factory {


    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
