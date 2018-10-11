package patterns.state.simple_tv;

/**
 * Created by wuyue on 2018/10/11.
 */
public class TvController implements PowerController {

    TvState mState;

    public static TvController getInstance(){
        return SingletonHolder.c;
    }

    private static class SingletonHolder{
        private static final TvController c =new TvController();
    }




    private void setmState(TvState mState) {
        this.mState = mState;
    }

    @Override
    public void powerOn() {
        setmState(new PowerOnState());
        System.out.println("开机");
    }

    @Override
    public void powerOff() {
        setmState(new PowerOffState());
        System.out.println("关机");
    }


    public void nextChannel() {
        mState.nextChannel();
    }

    public void preChannel() {
        mState.preChannel();

    }

    public void turnUp() {
        mState.turnUp();

    }


    public void turnDown() {
        mState.turnDown();

    }
}
