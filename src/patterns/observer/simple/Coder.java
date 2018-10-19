package patterns.observer.simple;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wuyue on 2018/10/18.
 */
public class Coder implements Observer {

    public String name;

    public Coder(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("hi,"+name+"----"+arg);
    }

    @Override
    public String toString() {
        return "coder:"+name;
    }
}
