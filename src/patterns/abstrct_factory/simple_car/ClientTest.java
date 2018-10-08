package patterns.abstrct_factory.simple_car;

/**
 * Created by wuyue on 2018/10/8.
 */
public class ClientTest  {
    public static void main(String[] args){
        //  Q3 工厂
        CarFactory factory1 =new Q3Factory();
        factory1.createBrake().brake();
        factory1.createEngine().engine();
        factory1.createTire().tire();
        System.out.println("-------------------");

        CarFactory factory2 = new Q7Factory();
        factory2.createBrake().brake();
        factory2.createEngine().engine();
        factory2.createTire().tire();
    }
}
