package patterns.abstrct_factory.simple_car;

/**
 * Created by wuyue on 2018/10/8.
 */
public class Q7Factory extends CarFactory {
    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }

    @Override
    public ITire createTire() {
        return new SUVTire();
    }
}
