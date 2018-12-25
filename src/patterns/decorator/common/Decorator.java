package patterns.decorator.common;

/**
 * Created by wuyue on 2018/11/29.
 */
public abstract class Decorator extends Component{
    private Component component ;


    public Decorator (Component component){
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
