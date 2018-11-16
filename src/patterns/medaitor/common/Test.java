package patterns.medaitor.common;

/**
 * Created by wuyue on 2018/11/15.
 */
public class Test {
    public static void main(String[] args){


        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA  colleagueA =new ConcreteColleagueA(mediator);
        ConcreteColleagueB  colleagueB =new ConcreteColleagueB(mediator);
        colleagueA.action();
        colleagueB.action();
    }
}
