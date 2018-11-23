package patterns.template_method.simple;

/**
 * Created by wuyue on 2018/11/23.
 */
public class ClientTest {
    public static void main(String[] args){
        AbstractComputer a = new CoderComputer();
        a.startUp();

        AbstractComputer b =new MilitaryComputer();
        b.startUp();
    }
}
