package patterns.factory.example_factory;

/**
 * Created by wuyue on 2018/9/29.
 */
public abstract class AudiFactory {
    /**
     *   某车型的工厂方法
     * @param clz 具体的SUV型号类型
     * @param <T>
     * @return  具体型号的SUV车对象
     */
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
