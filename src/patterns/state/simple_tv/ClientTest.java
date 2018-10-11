package patterns.state.simple_tv;


/**
 * Created by wuyue on 2018/10/11.
 */
public class ClientTest {

    public static void main(String[] args) {

//        TvState state =new PowerOffState();
//        state.nextChannel();

        // 不使用TvController 时 ，可以这样写
//        ClientTest clientTest =new ClientTest();
//        clientTest.setmState(new PowerOffState());
//        clientTest.nextChannel();
//        clientTest.setmState(new PowerOnState());
//        clientTest.nextChannel();


        // 把操作再封装一次
        TvController p = TvController.getInstance();
        p.powerOn();
        p.nextChannel();
        p.preChannel();
        p.turnUp();
        p.turnDown();
        p.powerOff();
        p.nextChannel();
        p.preChannel();
        p.turnUp();
        p.turnDown();



    }


    TvState mState;

    public void setmState(TvState mState) {
        this.mState = mState;
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
