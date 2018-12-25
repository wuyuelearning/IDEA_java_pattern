package patterns.decorator.simple;

/**
 * Created by wuyue on 2018/11/29.
 */
public class CheapCloth extends PersonCloth {
    public CheapCloth(Person person) {
        super(person);
    }

    private void dressTShirt(){
        System.out.println("CheapCloth dressTShirt");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressTShirt();
    }
}
