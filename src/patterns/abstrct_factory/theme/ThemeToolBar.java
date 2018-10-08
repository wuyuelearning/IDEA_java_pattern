package patterns.abstrct_factory.theme;

/**
 * Created by wuyue on 2018/10/8.
 */
public abstract class ThemeToolBar {

    public ThemeToolBar(String context) {

    }

    public abstract void initIcon();

    public abstract void initTextColor();

    public abstract void initBackGroundColor();
}
