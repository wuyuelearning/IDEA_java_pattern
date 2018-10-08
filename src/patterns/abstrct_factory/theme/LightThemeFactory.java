package patterns.abstrct_factory.theme;

/**
 * Created by wuyue on 2018/10/8.
 */
public class LightThemeFactory extends AbstractThemeFactory {
    public LightThemeFactory(String context) {
        super(context);
    }

    public LightThemeFactory( ) {
        super("");
    }

    @Override
    public ThemeButton createThemeButton() {
        return new LightButton();
    }

    @Override
    public ThemeToolBar createThemeToolBar() {
        return new LightToolBar();
    }
}
