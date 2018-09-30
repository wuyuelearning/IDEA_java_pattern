package patterns.factory.reflect_factory;

/**
 * Created by wuyue on 2018/9/29.
 */
public abstract class Factory {

    /**
     * 抽象工厂方法
     * 具体生产什么有子类去实现
     *
     * @param clz  产品对象类类型
     * @param <T>
     * @return  具体的产品对象
     */
   public abstract <T extends Product> T createProduct(Class<T> clz);
}
