package patterns.factory.reflect_factory;

/**
 * Created by wuyue on 2018/9/29.
 * 对于具体的工厂类，通过反射获取类的示例
 */
public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;
        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) p;
    }
}
