package test;

/**
 * Created by wuyue on 2018/12/29.
 */
public class Sub extends Base {
    @Override
    void fun1(int a) {
        System.out.println("Sub");
    }
   public void fun1(int a,String v){   System.out.println("Sub 1");}
    void fun2(int a){}

}
