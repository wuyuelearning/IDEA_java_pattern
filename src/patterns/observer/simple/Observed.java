package patterns.observer.simple;

import java.util.Observable;

/**
 * Created by wuyue on 2018/10/18.
 */
public class Observed extends Observable {

    public void notifyCoders(String content){
        // 标识状态或者内容发生变化
        setChanged();
        // 通知所有观察者
        notifyObservers(content);
    }
}
