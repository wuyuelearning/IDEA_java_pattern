package patterns.factory.example_factory;

/**
 * Created by wuyue on 2018/9/29.
 */
public class ClientTest {
    public static void main(String[] args){
        AudiFactory factory =new AudiCarFactory();

        AudiQ3 audiQ3 =factory.createAudiCar(AudiQ3.class);
        audiQ3.drive();
        audiQ3.selfNavigation();

        AudiQ5 audiQ5 =factory.createAudiCar(AudiQ5.class);
        audiQ5.drive();
        audiQ5.selfNavigation();

        AudiQ7 audiQ7 =factory.createAudiCar(AudiQ7.class);
        audiQ7.drive();
        audiQ7.selfNavigation();
    }
}
