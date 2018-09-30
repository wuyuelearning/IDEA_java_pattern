package patterns.factory.simple_factory;

/**
 * Created by wuyue on 2018/9/29.
 */
public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct(Product product) {
        if (product instanceof ConcreteProductA){
            return new ConcreteProductA();
        } else if(product instanceof ConcreteProductB){
            return new ConcreteProductB();
        }
        return null;
    }

    @Override
    public Product createProduct() {
        return null;
    }
}
