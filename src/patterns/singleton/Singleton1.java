package patterns.singleton;


/**
 *  饿汉单例模式
 */
public class Singleton1 {
    private static final Singleton1 mInstance =new Singleton1();

    private Singleton1(){

    }

    public static Singleton1 getSingleton(){
        return  mInstance;
    }
}
