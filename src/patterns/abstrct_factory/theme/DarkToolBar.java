package patterns.abstrct_factory.theme;

/**
 * Created by wuyue on 2018/10/8.
 */
public class DarkToolBar extends ThemeToolBar {
    public DarkToolBar(String context) {
        super(context);
    }

    public DarkToolBar(){
        super("");

    }

    @Override
    public void initIcon() {
        System.out.println("drak toolbar icon");
    }

    @Override
    public void initTextColor() {
        System.out.println("drak toolbar text color");
    }

    @Override
    public void initBackGroundColor() {
        System.out.println("drak toolbar background color");
    }
}
