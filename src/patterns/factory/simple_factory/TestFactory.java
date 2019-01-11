package patterns.factory.simple_factory;

/**
 * Created by wuyue on 2019/1/8.
 */
public class TestFactory extends PhoneFactory {
    @Override
    public Phone createMeizu(){
        return new Meizu();
    }
    @Override
    public Phone createXiaoMi(){
        return new XiaoMi();
    }
}
