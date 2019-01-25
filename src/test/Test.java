package test;


import com.sun.jndi.toolkit.url.Uri;
import com.sun.xml.internal.fastinfoset.util.CharArrayIntMap;
import patterns.bridge.simple.Suger;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuyue on 2018/11/16.
 */
public class Test {
    public static void main(String[] args) {

//        fun1();

//        fun2();


        Test test = new Test();
//        test.fun5();
        test.fun6();
//        fun4();


    }

    private void fun6() {

        PersonTest f =new PersonTest("父亲");
        PersonTest s1 =new PersonTest("大儿子",f);
        PersonTest s2= CloneUtils.clone(s1);

        s2.setName("小儿子");
        s1.getFather().setName("干爹");
        System.out.println(s1.getName()+" -- "+s1.getFather().getName());
        System.out.println(s2.getName()+" -- "+s2.getFather().getName());
    }

    private void fun5() {
        CallBackImpl c = new CallBackImpl();

    }


    private static void fun4() {

//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(null);
//        for (int i :list){
//            System.out.println(""+i);
//        }
//
//        for (Integer i :list){
//            System.out.println(""+((i!=null)?i:0));
//        }


        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        for (String i : list) {
            System.out.println(i);
        }
    }

    private static void fun3() {
        final int LIMIT = 2000;
        long count = 2147483634L;
        if (count + 1000 <= LIMIT) {
            System.out.println("1==>" + count);
        } else {
            System.out.println("2===>");
        }
    }


    private static void fun2() {
        IConcrete concrete = new Concrete();
    }


    private static void fun1() {
        System.out.println(-1 % 2 == 1 ? "奇数" : "偶数");

        System.out.println(10.00 - 9.60);

        NumberFormat f = new DecimalFormat("#.####");
        System.out.println(f.format(10.00 - 9.60));

        double i = 10.00;
        double j = 9.60;
        System.out.println(i - j);

        System.out.println((i * 100 - j * 100) / 100);

        BigDecimal b1 = new BigDecimal(i);
        BigDecimal b2 = new BigDecimal(j);
        System.out.println(b1.subtract(b2));

        BigDecimal b3 = new BigDecimal(i);
        BigDecimal b4 = new BigDecimal(Double.toString(j));
        System.out.println(b3.subtract(b4));

        System.out.println(30 * 10000 * 1000);
        System.out.println(30 * 10000 * 1000 * 60L * 8);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.MAX_VALUE + 1);

        System.out.println(214748364787L);

        System.out.println(2147483647 + 1 > 2000 ? 1 : 0);


        System.out.println(Integer.MAX_VALUE + 1 > 2000 ? 1 : 0);

        System.out.println((double) Integer.MAX_VALUE + 1);

        System.out.println(Long.MAX_VALUE > 2000 ? 1 : 0);


        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println(i1);
        System.out.println(i1.intValue() == i2.intValue());
        System.out.println(i1.intValue() > i2.intValue());
        System.out.println(i1 < i2);


        int it = 100;
        long it2 = (long) it;
        fun11(it2);


    }

//    public static void fun11(int a) {
//        System.out.println("int ");
//    }

    public static void fun11(long a) {
        System.out.println("long ");
    }

    public static void fun11(Long a) {
        System.out.println("Long ");
    }
}
