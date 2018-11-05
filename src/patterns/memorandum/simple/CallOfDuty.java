package patterns.memorandum.simple;

/**
 * Created by wuyue on 2018/10/22.
 * <p>
 * 游戏类
 */
public class CallOfDuty {
    private int mCheckpoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "weapon";

    public void play() {
        System.out.println("paly the game " + String.format("num : %d", mCheckpoint) + "playing");
        mLifeValue -= 10;
        System.out.println("move in");
        mCheckpoint++;
        System.out.println("move to :" + String.format("num : %d", mCheckpoint));
    }

    public void quit() {
        System.out.println("------------------");
        System.out.println("value : " + this.toString());
        System.out.println("quit the game");
        System.out.println("-------------------");
    }

    public void setCheckpoint(int mCheckpoint) {
        this.mCheckpoint = mCheckpoint;
    }

    public void setLifeValue(int mLifeValue) {
        this.mLifeValue = mLifeValue;
    }

    public void setWeapon(String mWeapon) {
        this.mWeapon = mWeapon;
    }

    /**
     * 创建备忘录
     */
    public Memoto createMemoto() {
        Memoto memoto = new Memoto();
        memoto.mCheckpoint = mCheckpoint;
        memoto.mLifeValue = mLifeValue;
        memoto.mWeapon = mWeapon;

        return memoto;
    }

    /**
     * 恢复游戏
     *
     * @param memoto
     */
    public  void restore(Memoto memoto) {
        this.mCheckpoint = memoto.mCheckpoint;
        this.mLifeValue = memoto.mLifeValue;
        this.mWeapon = memoto.mWeapon;
        System.out.println("恢复后的游戏属性： " + this.toString());
    }

    @Override
    public String toString() {
        return "Memoto [mCheckpoint=" + mCheckpoint + ",mLifeValue= " + mLifeValue + ",mWeapon= " + mWeapon + "]";
    }
}

