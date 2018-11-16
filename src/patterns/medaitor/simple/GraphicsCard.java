package patterns.medaitor.simple;

/**
 * Created by wuyue on 2018/11/16.
 */
public class GraphicsCard extends Colleague {

    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }
    public void videoPlay(String data){
        System.out.println("视频："+data);
    }

}
