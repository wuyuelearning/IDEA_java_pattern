package patterns.medaitor.simple;

/**
 * Created by wuyue on 2018/11/16.
 */
public class MainBoard extends Mediator {

    private CDDevice cdDevice;
    private CPU cpu;
    private SoundCard soundCard;
    private GraphicsCard graphicsCard;

    @Override
    public void changed(Colleague c) {

        if (c == cdDevice) {
            handleCD((CDDevice) c);
        } else if (c == cpu) {
            handleCPU((CPU) c);
        }
    }

    private void handleCD(CDDevice cdDevice) {
        cpu.decodeData(cdDevice.read());
    }

    private void handleCPU(CPU cpu) {
        soundCard.sounfPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
