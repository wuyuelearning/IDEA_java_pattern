package patterns.template_method.simple;

/**
 * Created by wuyue on 2018/11/23.
 */
public class CoderComputer extends AbstractComputer {
    @Override
    public void login() {
        System.out.println("CoderComputer login");
    }
}
