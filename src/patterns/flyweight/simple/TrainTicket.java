package patterns.flyweight.simple;

import java.util.Random;

/**
 * Created by wuyue on 2018/12/25.
 */
public class TrainTicket implements Ticket {

    private String from;
    private String to;
    private String bunk;
    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(30);
        System.out.println(" from: " + from + " to: " + to + " bunk:" + bunk + " price: " + price);
    }
}
