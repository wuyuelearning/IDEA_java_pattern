package patterns.singleton;

/**
 * DCL (Double Check Lock) 单例模式
 */
public class Singleton3 {
    private static volatile Singleton3 mInstance = null;

    private Singleton3() {

    }

    public static Singleton3 getSingleton() {
        if (mInstance == null) {
            synchronized (Singleton3.class) {
                if (mInstance == null) {
                    mInstance = new Singleton3();
                }
            }
        }
        return mInstance;
    }
}
