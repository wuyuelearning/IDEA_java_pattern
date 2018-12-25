package patterns.flyweight.simple;

/**
 * Created by wuyue on 2018/12/25.
 */
public class Test {
    public static void main(String[] args){
        Ticket ticket1 =TicketFactory.getTicket("a1","b1");
        ticket1.showTicketInfo("1");

        Ticket ticket2 =TicketFactory.getTicket("a2","b2");
        ticket2.showTicketInfo("2");


        Ticket ticket3 =TicketFactory.getTicket("a3","b3");
        ticket3.showTicketInfo("3");



        Ticket ticket11 =TicketFactory2.getTicket("a11","b11");
        ticket11.showTicketInfo("11");

        Ticket ticket12 =TicketFactory2.getTicket("a12","b12");
        ticket12.showTicketInfo("12");


        Ticket ticket13 =TicketFactory2.getTicket("a13","b13");
        ticket13.showTicketInfo("13");

        Ticket ticket14 =TicketFactory2.getTicket("a11","b11");
        ticket14.showTicketInfo("15");


        Ticket ticket15 =TicketFactory2.getTicket("a12","b12");
        ticket15.showTicketInfo("13");
    }
}
