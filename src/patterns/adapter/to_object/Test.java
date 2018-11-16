package patterns.adapter.to_object;

/**
 * Created by wuyue on 2018/11/14.
 * 对象适配器
 */
public class Test {
    public static void main(String[] args){
        VoltAdapter voltAdapter =new VoltAdapter(new Volt220());
        System.out.println(voltAdapter.getVolt5());

        int right = 0x001;
        int bottom = 0x002;
        int top = 0x008;
        int state = right | bottom;
        System.out.println("state = " + ((state ) ));
        System.out.println("是否存在 right = " + ((state & right) == right));
        System.out.println("是否存在 top = " + ((state & top) == top));


        System.out.println("剔除 right 状态前 " + state);
        state &= ~right;
        System.out.println("剔除 right 状态后 " + state);
        state &= ~top;
        System.out.println("剔除不存在的 top 状态 " + state);
        System.out.println();
    }
}
