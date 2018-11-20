package patterns.iterator.common;

/**
 * Created by wuyue on 2018/11/19.
 */
public class ClientTest  {
    public static void main(String[] args){
        Aggregate<String> obj = new ConcreteAggregate<>();
        obj.add("a");
        obj.add("b");
        obj.add("c");
        obj.add("d");
        Iterator<String> iterator =obj.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
