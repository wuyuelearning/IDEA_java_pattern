package patterns.abstrct_factory.simple_car;

/**
 * Created by wuyue on 2018/10/8.
 */
public abstract class CarFactory {

   public abstract IEngine createEngine();

    public abstract   IBrake createBrake();

    public abstract  ITire createTire();
}
