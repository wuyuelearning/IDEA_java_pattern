package patterns.iterator.common;

/**
 * Created by wuyue on 2018/11/19.
 */
public interface Aggregate<T> {
    void add(T obj);

    void remove(T obj);

    Iterator<T> iterator();

}
