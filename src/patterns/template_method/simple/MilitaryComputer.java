package patterns.template_method.simple;

/**
 * Created by wuyue on 2018/11/23.
 */
public class MilitaryComputer extends AbstractComputer {

    @Override
    public void login() {
        System.out.println("MilitaryComputer login");
    }

    @Override
    public void checkHardware() {
        System.out.println("MilitaryComputer checkHardware");
    }
}
