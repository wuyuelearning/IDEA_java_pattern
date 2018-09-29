package patterns.builder;

/**
 * Created by wuyue on 2018/9/27.
 * Computer 与设置ComputerConfig拆分
 */
public class Computer3 {
    private ComputerConfig mComputerConfig;

    public void init(ComputerConfig computerConfig){
        this.mComputerConfig =computerConfig;
    }

    public Computer3(ComputerConfig computerConfig){
        this.mComputerConfig =computerConfig;
    }
    public Computer3(){

    }

    @Override
    public String toString() {
        return "Computer [Board="+mComputerConfig.getmBoard()+",Display="+mComputerConfig.getmDisplay()+",OS="+mComputerConfig.getmOS()+"]";
    }
}
