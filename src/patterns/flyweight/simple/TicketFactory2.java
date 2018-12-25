package patterns.flyweight.simple;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wuyue on 2018/12/25.
 *
 *  享元模式 ，共享对象
 */
public class TicketFactory2 {
    static Map<String, Ticket> map = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;

        if (map.containsKey(key)) {
            System.out.println("缓存==>" + key);
            return map.get(key);
        } else {
            System.out.println("创建对象==>" + key);
            Ticket ticket = new TrainTicket(from, to);
            map.put(key, ticket);
            return ticket;
        }
    }

}
