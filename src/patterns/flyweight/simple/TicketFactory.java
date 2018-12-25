package patterns.flyweight.simple;

/**
 * Created by wuyue on 2018/12/25.
 *
 *   非享元模式 没有共享对象
 */
public class TicketFactory {

    public static Ticket getTicket(String from,String to){
        return new TrainTicket(from,to);
    }


}
