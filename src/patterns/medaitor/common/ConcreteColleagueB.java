package patterns.medaitor.common;

/**
 * Created by wuyue on 2018/11/15.
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ConcreteColleagueB");
    }
}
