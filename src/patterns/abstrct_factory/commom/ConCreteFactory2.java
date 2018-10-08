package patterns.abstrct_factory.commom;

/**
 * Created by wuyue on 2018/10/8.
 */
public class ConCreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createPeocudtA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createPeocudtB() {
        return new ConcreteProductB2();
    }
}
