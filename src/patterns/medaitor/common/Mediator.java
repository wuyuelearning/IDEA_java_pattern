package patterns.medaitor.common;


/**
 * Created by wuyue on 2018/11/15.
 */
public abstract class Mediator {

    public ConcreteColleagueA colleagueA;
    public ConcreteColleagueB colleagueB;

    public abstract void method();


    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
