package patterns.decorator.simple;

/**
 * Created by wuyue on 2018/11/29.
 */
public class Client {


    public static void main(String[] args){
        Person p =new Boy();


        PersonCloth p1 =new ExpensiveCloth(p);
        p1.dressed();

        PersonCloth p2 =new CheapCloth(p);
        p2.dressed();


    }
}
