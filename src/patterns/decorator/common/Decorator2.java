package patterns.decorator.common;

/**
 * Created by wuyue on 2018/11/29.
 */
public class Decorator2 extends Component {

    private Component component ;


    public Decorator2 (Component component){
        this.component = component;
    }

    @Override
    public void operate() {
        System.out.println("Decorator2  opereta");
        operateA();
        operateB();
    }

    private void operateA(){
        System.out.println("Decorator2 operateA");
    }


    private void operateB(){
        System.out.println("Decorator2 operateB");
    }

}
