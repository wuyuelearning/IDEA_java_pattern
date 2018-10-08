package patterns.abstrct_factory.theme;

/**
 * Created by wuyue on 2018/10/8.
 */
public class LightButton extends ThemeButton {
    public LightButton(String context) {
        super(context);
    }

    public LightButton() {
        super("");
    }

    @Override
    public void initTextColor() {
        System.out.println("light button text color");
    }

    @Override
    public void initBackGroundColor() {
        System.out.println("light button background color");
    }
}
