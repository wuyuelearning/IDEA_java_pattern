package patterns.factory.sql_factory;

/**
 * Created by wuyue on 2018/9/30.
 */
public class ClientTest {
    public static void main(String[] args) {

        IOHandler handler1 = IOFactory.getIOHandler(FileHandler.class);
        System.out.println(handler1.query("111"));

        IOHandler handler2 = IOFactory.getIOHandler(XMLHandler.class);
        System.out.println(handler2.query("111"));

        IOHandler handler3 = IOFactory.getIOHandler(DBHandler.class);
        System.out.println(handler3.query("111"));

    }
}
