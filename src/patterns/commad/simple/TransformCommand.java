package patterns.commad.simple;

/**
 * Created by wuyue on 2018/10/17.
 */
public class TransformCommand implements Command {
    TerisMachine terisMachine;

    public TransformCommand(TerisMachine terisMachine) {
        this.terisMachine = terisMachine;
    }

    @Override
    public void excute() {
        terisMachine.trandform();
    }
}
