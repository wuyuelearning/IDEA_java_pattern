package patterns.medaitor.simple;

/**
 * Created by wuyue on 2018/11/16.
 */
public class Test  {
    public static void main(String[] args){
        MainBoard mainBoard =new MainBoard();

        CDDevice cdDevice =new CDDevice(mainBoard);
        CPU cpu =new CPU(mainBoard);
        GraphicsCard graphicsCard =new GraphicsCard(mainBoard);
        SoundCard soundCard =new SoundCard(mainBoard);

        mainBoard.setCdDevice(cdDevice);
        mainBoard.setCpu(cpu);
        mainBoard.setSoundCard(soundCard);
        mainBoard.setGraphicsCard(graphicsCard);

        cdDevice.load();
    }
}
