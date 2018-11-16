package patterns.medaitor.common;

/**
 * Created by wuyue on 2018/11/15.
 */
public abstract class Colleague {
    private Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    // 具体的行为
    public abstract void action();
}
