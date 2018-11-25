package patterns.template_method.simple;


/**
 * Created by wuyue on 2018/11/23.
 */
public  abstract class AbstractComputer  {
    public void powerOn(){
        System.out.println("powerOn");
    }

    public void checkHardware(){
        System.out.println("checkHardware");
    }

    public void loadOs(){
        System.out.println("loadOs");
    }

    public void login(){
        System.out.println("login");
    }

    // final  方法不能覆写
    public final void startUp(){
        System.out.println("---startUp---");
        powerOn();
        checkHardware();
        loadOs();
        loadOs();
        login();
        System.out.println("---end---");
    }
}
