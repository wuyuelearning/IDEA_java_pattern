package patterns.factory.sql_factory;

/**
 * Created by wuyue on 2018/9/30.
 */
public class IOFactory {

    public static <T extends IOHandler> T getIOHandler(Class<T> clz) {
        IOHandler handler = null;
        try {
            handler = (IOHandler) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) handler;
    }
}
