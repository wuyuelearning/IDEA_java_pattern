package patterns.facade.simple;


/**
 * Created by wuyue on 2018/12/27.
 */
public class MobilePhone  {

    private  IPhone phone =new PhoneImpl();
    private ICamera camera =new CameraImpl();

    public void dail(){
        phone.dail();
    }

    public void hangup(){
        phone.hangup();
    }
    public void takePicture(){
        camera.open();
        camera.takePicture();
    }

    public void close(){
        camera.close();
    }

    public void videoChat(){
        System.out.println(" ==>视频通话");
        camera.open();
        phone.dail();
    }
}
