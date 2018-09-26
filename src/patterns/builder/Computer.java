package patterns.builder;


// 计算机抽象类，即product角色
public abstract class Computer {

    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer(){

    }

    public void setBoard(String board){
        this.mBoard =board;
    }

    public void setDisplay(String display){
        this.mDisplay =display;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer [Board="+mBoard+",Display="+mDisplay+",OS="+mOS+"]";
    }
}
