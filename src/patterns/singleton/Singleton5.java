package patterns.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton5 implements Serializable {
    private static final long serialVersionUID = 0L;
    private static final Singleton5 INSTANCE = new Singleton5();

    private Singleton5() {
    }
    public static Singleton5 getInstance(){
        return INSTANCE;
    }
    private Object readResolve () throws ObjectStreamException{
        return INSTANCE;
    }
}
