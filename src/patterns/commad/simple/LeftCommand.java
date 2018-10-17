package patterns.commad.simple;

/**
 * Created by wuyue on 2018/10/17.
 */
public class LeftCommand implements Command {

    TerisMachine terisMachine;

    public LeftCommand(TerisMachine terisMachine) {
        this.terisMachine = terisMachine;
    }

    @Override
    public void excute() {
        terisMachine.toLeft();
    }
}
