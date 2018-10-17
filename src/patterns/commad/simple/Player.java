package patterns.commad.simple;

/**
 * Created by wuyue on 2018/10/17.
 */
public class Player {
    public static void main(String[] atgs){
        TerisMachine terisMachine =new TerisMachine();

        Command leftCommand =new LeftCommand(terisMachine);
        Command rightCommand = new RightCommand(terisMachine);
        Command fallCommand = new FallCommand(terisMachine);
        Command transformCommand = new TransformCommand(terisMachine);

        Buttons buttons =new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setFallCommand(fallCommand);
        buttons.setTransformCommand(transformCommand);

        buttons.toLeft();
        buttons.toRight();
        buttons.fastToBottom();
        buttons.trandform();

        terisMachine.toLeft();
        terisMachine.toRight();
        terisMachine.fastToBottom();
        terisMachine.trandform();

    }
}
