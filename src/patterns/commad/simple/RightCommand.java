package patterns.commad.simple;

/**
 * Created by wuyue on 2018/10/17.
 */
public class RightCommand implements Command {

    TerisMachine terisMachine;

    public RightCommand(TerisMachine terisMachine) {
        this.terisMachine = terisMachine;
    }

    @Override
    public void excute() {
        terisMachine.toRight();
    }
}
