package patterns.abstrct_factory.commom;

/**
 * Created by wuyue on 2018/10/8.
 */
public class ClientTest {
    public static void main(String[] args){
        ConCreteFactory1 factory =new ConCreteFactory1();
        AbstractProductA productA=factory.createPeocudtA();
        productA.method();
    }
}
