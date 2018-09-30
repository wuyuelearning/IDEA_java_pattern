package patterns.factory.sql_factory;

/**
 * Created by wuyue on 2018/9/30.
 */
public class DBHandler extends IOHandler {
    @Override
    public void add(String id, String name) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void update(String id, String name) {

    }

    @Override
    public String query(String id) {
        return "DB";
    }
}
