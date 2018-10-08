package patterns.abstrct_factory.theme;

/**
 * Created by wuyue on 2018/10/8.
 */
public class LightToolBar extends ThemeToolBar {
    public LightToolBar(String context) {
        super(context);
    }

    public LightToolBar() {
        super("");
    }

    @Override
    public void initIcon() {
        System.out.println("light toolbar icon");
    }

    @Override
    public void initTextColor() {
        System.out.println("light toolbar text color");
    }

    @Override
    public void initBackGroundColor() {
        System.out.println("light toolbar background color");
    }
}
