package patterns.stategy.calculate;

/**
 * Created by wuyue on 2018/10/11.
 */
public class CalculateSelector implements CalcuateContorller {

    CalculateStrategy strategy;

    private static CalculateSelector selector ;

    private CalculateSelector(){

    }

     static CalculateSelector getInstance(){
        return SingletonHolder.selector;
    }

    private static class SingletonHolder{
        private static final   CalculateSelector selector =new CalculateSelector();
    }

    //  赋值具体的策略
    private void setStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void busStrategy() {
        System.out.println("BusStrategy");
        setStrategy(new BusStrategy());
    }

    @Override
    public void subwayStrategy() {
        System.out.println("SubwayStrategy");
        setStrategy(new SubWayStrategy());

    }

    @Override
    public void taxiStrategy() {
        System.out.println("TaxiStrategy");
        setStrategy(new TaxiStrategy());
    }

    //  在具体的策略中，运行具体的方法
    public int calculatePrice(int km) {
        return this.strategy.calculatePrice(km);
    }
}
