package patterns.builder;

public class Computer2 {
    private String mBoard;
    private String mDisplay;
    private String mOS;

    public static class Builder{

        private String board;
        private String display;
        private String os;
        private  Computer2 mComputer;

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

        Computer2 create(){
            mComputer =new Computer2();
            setConfig();
            return  mComputer;
        }

        private void setConfig(){
            mComputer.mBoard=board;
            mComputer.mDisplay=display;
            mComputer.mOS =os;
        }
    }

    @Override
    public String toString() {
        return "Computer [Board="+mBoard+",Display="+mDisplay+",OS="+mOS+"]";
    }
}
