package patterns.factory.simple_factory;

/**
 * Created by wuyue on 2018/9/29.
 */
public abstract  class Factory {
    /**
     *  抽象工厂方法
     *  具体生产什么有子类去实现
     *
     * @ return 具体的产品对象
     */
    public abstract Product createProduct(Product product);
    public abstract Product createProduct();
}
