package patterns.mvc.Simple;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOError;
import java.io.IOException;
import java.net.URL;

/**
 * Created by wuyue on 2018/12/29.
 */
public class Model {
    private Image mImage; // 展示的图像
    private OnStateChangeListener mListener; //  Model 状态改变监听器

    public interface OnStateChangeListener {
        void onStateChanged(Image image);
    }

    public Model() {
        try {
            // 初始化默认展示一个图片
            mImage = ImageIO.read(new URL("http://pic.lvmama.com//uploads/pc/place2/2018-12-21/624d07c9-a79c-4de9-8147-920210bcc962_1280_.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setOnStateChangeListener(OnStateChangeListener mListener) {
        this.mListener = mListener;
    }

    public void ImageLoad() {
        new Thread(() ->
        {
            try {
                Thread.sleep(3000);
                // 获取图像
                mImage =ImageIO.read(new URL("http://pic.lvmama.com//uploads/pc/place2/2018-06-26/91d10b6e-4d75-4e6f-98d2-3f8997546f93.jpg"));
                if (null!=mListener){
                    // 回传给View
                    mListener.onStateChanged(mImage);
                }
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void clear(){
        mImage =null;

        if (null!=mListener){
            // 回传给View
            mListener.onStateChanged(null);
        }
    }

    public Image getImage(){
        return mImage;
    }
}
