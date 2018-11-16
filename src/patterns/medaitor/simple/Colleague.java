package patterns.medaitor.simple;

/**
 * Created by wuyue on 2018/11/16.
 */
public abstract class Colleague {
    public Mediator mediator;

    public Colleague (Mediator mediator){
        this.mediator = mediator;
    }
}
