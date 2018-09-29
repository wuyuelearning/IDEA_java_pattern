package patterns.singleton;

public class SingletonTest {
    public static void main(String[] args){
        Singleton1 singleton1 =Singleton1.getSingleton();
        Singleton1 singleton2 =Singleton1.getSingleton();
        Singleton1 singleton3 =Singleton1.getSingleton();
        System.out.println(singleton1.toString());
        System.out.println(singleton2.toString());
        System.out.println(singleton3.toString());

        Singleton2 singleton21 =Singleton2.getSingleton();
        Singleton2 singleton22 =Singleton2.getSingleton();
        Singleton2 singleton23 =Singleton2.getSingleton();
        System.out.println(singleton21.toString());
        System.out.println(singleton22.toString());
        System.out.println(singleton23.toString());

        Singleton3 singleton31 =  Singleton3.getSingleton();
        Singleton3 singleton32 =  Singleton3.getSingleton();
        Singleton3 singleton33 =  Singleton3.getSingleton();
        System.out.println(singleton31.toString());
        System.out.println(singleton32.toString());
        System.out.println(singleton33.toString());

        Singleton4 singleton41 =Singleton4.getInstance();
        Singleton4 singleton42 =Singleton4.getInstance();
        Singleton4 singleton43 =Singleton4.getInstance();
        System.out.println(singleton41.toString());
        System.out.println(singleton42.toString());
        System.out.println(singleton43.toString());

        Singleton5 singleton51 =Singleton5.getInstance();
        Singleton5 singleton52 =Singleton5.getInstance();
        Singleton5 singleton53 =Singleton5.getInstance();
        System.out.println(singleton51.toString());
        System.out.println(singleton52.toString());
        System.out.println(singleton53.toString());



    }
}
