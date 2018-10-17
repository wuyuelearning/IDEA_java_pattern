package patterns.commad.simple;

/**
 * Created by wuyue on 2018/10/17.
 */
public class FallCommand implements Command{
    TerisMachine terisMachine;

    public FallCommand(TerisMachine terisMachine) {
        this.terisMachine = terisMachine;
    }

    @Override
    public void excute() {
        terisMachine.fastToBottom();
    }
}
