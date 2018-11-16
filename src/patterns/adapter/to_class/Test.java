package patterns.adapter.to_class;

/**
 * Created by wuyue on 2018/11/14.
 *   类适配器
 */
public class Test {
    public static void main(String[] args){
        VoltAdapter adapter =new VoltAdapter();
        System.out.println(adapter.getVolt5());
    }
}
