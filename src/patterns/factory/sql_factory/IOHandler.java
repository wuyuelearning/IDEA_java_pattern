package patterns.factory.sql_factory;

/**
 * Created by wuyue on 2018/9/30.
 *  sql  对数据增、删、改、查
 *  可以将每一种数据操作方式作为一个产品类，在抽象方法中定义操作方法
 */
public abstract class IOHandler {

    public abstract void add(String id, String name);

    public abstract void remove(String  id);

    public abstract void update(String id,String name);

    public abstract String query(String id);
}
