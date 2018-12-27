package patterns.facade.simple;

/**
 * Created by wuyue on 2018/12/27.
 */
public class CameraImpl implements ICamera {
    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }
}
