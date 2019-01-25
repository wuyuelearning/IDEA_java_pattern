package test;

import java.io.*;

/**
 * Created by wuyue on 2019/1/25.
 */
public class CloneUtils {
    public static <T extends Serializable > T clone(T obj){

        T cloneObj =null;
        try {
            ByteArrayOutputStream baos =new ByteArrayOutputStream();
            ObjectOutputStream oos =new ObjectOutputStream(baos);
            oos.writeObject(obj);
            oos.close();

            ByteArrayInputStream bais =new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois =new ObjectInputStream(bais);
            cloneObj = (T) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cloneObj;

    }
}
