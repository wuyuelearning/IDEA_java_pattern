package patterns.builder;

/**
 * Created by wuyue on 2018/9/27.
 * Computer 与设置拆分
 */
public class ComputerConfig {
    private String mBoard;
    private String mDisplay;
    private String mOS;

    public String getmBoard() {
        return mBoard;
    }

    public String getmOS() {
        return mOS;
    }

    public String getmDisplay() {
        return mDisplay;
    }

    public static class Builder{

        private String board;
        private String display;
        private String os;
        private ComputerConfig mComputerConfig;

       Builder setBoard(String board){
            this.board =board;
            return this;
        }


        Builder setDisplay (String display){
            this.display = display;
            return this;
        }

        public Builder setOS (String OS){
            this.os =OS;
            return this;
        }

        ComputerConfig create(){
            mComputerConfig =new ComputerConfig();
            setConfig();
            return  mComputerConfig;
        }

        private void setConfig(){
            mComputerConfig.mBoard=board;
            mComputerConfig.mDisplay=display;
            mComputerConfig.mOS =os;
        }
    }

    @Override
    public String toString() {
        return "Computer [Board="+mBoard+",Display="+mDisplay+",OS="+mOS+"]";
    }

}
