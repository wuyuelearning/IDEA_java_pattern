package patterns.decorator.simple;

/**
 * Created by wuyue on 2018/11/29.
 */
public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person person) {
        super(person);
    }

    private void dressShirt(){
        System.out.println("ExpensiveCloth dressShirt");
    }


    private void dressJean(){
        System.out.println("ExpensiveCloth dressJean");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressJean();
        dressShirt();
    }
}
