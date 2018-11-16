package patterns.medaitor.simple;

/**
 * Created by wuyue on 2018/11/16.
 */
public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void sounfPlay(String data){
        System.out.println("音频："+data);
    }

}
