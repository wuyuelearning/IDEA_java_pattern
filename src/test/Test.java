package test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by wuyue on 2018/11/16.
 */
public class Test {
    public static void main(String[] args) {

        fun1();

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
        long it2 = (long)it;
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
