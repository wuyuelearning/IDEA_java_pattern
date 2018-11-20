package patterns.iterator.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuyue on 2018/11/19.
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private List<T> list =new ArrayList<T>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(list);
    }
}
