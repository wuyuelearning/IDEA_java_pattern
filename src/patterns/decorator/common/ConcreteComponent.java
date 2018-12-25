package patterns.decorator.common;

/**
 * Created by wuyue on 2018/11/29.
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("ConcreteComponent operate");
    }
}
