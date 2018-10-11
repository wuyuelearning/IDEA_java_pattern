package patterns.stategy.calculate;

/**
 * Created by wuyue on 2018/10/9.
 */
public class TaxiStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        int price=10;
        if(km>5){
            int extraKm=km-5;
            int extraPrice = (int)(extraKm *1.4);
            price += extraPrice;
        }
        return price;
    }
}
