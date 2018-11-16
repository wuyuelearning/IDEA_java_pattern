package patterns.medaitor.common;

/**
 * Created by wuyue on 2018/11/15.
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void method() {
        colleagueA.action();
        colleagueB.action();
    }
}
