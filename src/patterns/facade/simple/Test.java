package patterns.facade.simple;

/**
 * Created by wuyue on 2018/12/27.
 */
public class Test {

    public static void main(String[] args){
        MobilePhone phone =new MobilePhone();
        phone.takePicture();
        phone.videoChat();
    }
}
