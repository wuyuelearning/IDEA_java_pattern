package patterns.stategy.calculate;

/**
 * Created by wuyue on 2018/10/9.
 */
public class TranficCalculator {

    CalculateStrategy calculateStrategy;

    public static void main(String[] args) {
        TranficCalculator calculator = new TranficCalculator();
        calculator.setStrategy(new BusStrategy());
        System.out.println("公交乘坐16公里价格为： " + calculator.calculatePrice(16));

        calculator.setStrategy(new SubWayStrategy());
        System.out.println("地铁乘坐16公里价格为： " + calculator.calculatePrice(16));

        calculator.setStrategy(new TaxiStrategy());
        System.out.println("出租车乘坐16公里价格为： " + calculator.calculatePrice(16));




        CalculateSelector.getInstance().busStrategy();
        System.out.println("公交乘坐16公里价格为： " + CalculateSelector.getInstance().calculatePrice(16));
        CalculateSelector.getInstance().subwayStrategy();
        System.out.println("地铁乘坐16公里价格为： " + CalculateSelector.getInstance().calculatePrice(16));
        CalculateSelector.getInstance().taxiStrategy();
        System.out.println("出租车乘坐16公里价格为： " + CalculateSelector.getInstance().calculatePrice(16));


    }

    //  赋值具体的策略
    private void setStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    //  在具体的策略中，运行具体的方法
    private int calculatePrice(int km) {
        return this.calculateStrategy.calculatePrice(km);
    }
}
