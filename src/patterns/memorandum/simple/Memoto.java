package patterns.memorandum.simple;

/**
 * Created by wuyue on 2018/10/22.
 * <p>
 * 备忘录类
 */
public class Memoto {
    public int mCheckpoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "Memoto [mCheckpoint=" + mCheckpoint + ",mLifeValue= " + mLifeValue + ",mWeapon= " + mWeapon + "]";
    }
}
