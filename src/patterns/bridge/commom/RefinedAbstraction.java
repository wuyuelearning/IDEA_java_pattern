package patterns.bridge.commom;

/**
 * Created by wuyue on 2018/12/27.
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    /**
     *  对父类抽象部分中的方法进行扩展
     */
    public void refinedOperation(){
        //  对Abstraction中的方法进行扩展
    }
}
