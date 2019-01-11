package patterns.factory.simple_factory;

import patterns.medaitor.simple.Mediator;

/**
 * Created by wuyue on 2018/9/29.
 */
public class ClientTest  {
    public static void main(String[] args){
//        Factory factory1 =new ConcreteFactoryA();
//        Product product1 = factory1.createProduct();
//        product1.method();
//
//        Factory factory2 =new ConcreteFactoryB();
//        Product product2 = factory2.createProduct();
//        product2.method();
//
//        Product product21 = StaticFactory.createProduct();
//        product21.method();
//
//        Factory factory3 =new ConcreteFactory();
//        Product product3 =factory3.createProduct(new ConcreteProductB());
//        product3.method();


        TestFactory f = new TestFactory();
        Meizu meizu =(Meizu) f.createMeizu();
        meizu.call();
        meizu.set();

    }
}
