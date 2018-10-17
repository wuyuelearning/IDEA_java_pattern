package patterns.commad.simple;

/**
 * Created by wuyue on 2018/10/17.
 */
public class Buttons {
    private Command leftCommand ;
    private Command rightCommand ;
    private Command fallCommand ;
    private Command transformCommand;

    public Buttons() {
    }


    public void setLeftCommand(Command leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(Command rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFallCommand(Command fallCommand) {
        this.fallCommand = fallCommand;
    }

    public void setTransformCommand(Command transformCommand) {
        this.transformCommand = transformCommand;
    }

    public void toLeft(){
       leftCommand.excute();
    }

    public void toRight(){
        rightCommand.excute();
    }

    public void fastToBottom(){
        fallCommand.excute();
    }

    public void trandform(){
        transformCommand.excute();
    }
}
