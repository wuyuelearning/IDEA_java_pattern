package patterns.singleton;

/**
 * 静态内部类单例模式
 */
public class Singleton4 {
    private Singleton4(){

    }

    public static Singleton4 getInstance (){
        return SingletonHolder.mInstance;
    }
    private static class SingletonHolder{
        private static final Singleton4 mInstance =new Singleton4();
    }

}
