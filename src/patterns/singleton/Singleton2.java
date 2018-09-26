package patterns.singleton;

/**
 * 懒汉单例模式
 */
public class Singleton2 {
    private static Singleton2 mInstance ;

    private Singleton2() {

    }

    public static synchronized Singleton2 getSingleton() {
        if (mInstance == null) {
            mInstance = new Singleton2();
        }
        return mInstance;
    }
}
