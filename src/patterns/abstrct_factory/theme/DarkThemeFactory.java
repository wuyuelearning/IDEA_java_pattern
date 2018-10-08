package patterns.abstrct_factory.theme;

/**
 * Created by wuyue on 2018/10/8.
 */
public class DarkThemeFactory extends AbstractThemeFactory {
    public DarkThemeFactory(String context) {
        super(context);
    }

    public DarkThemeFactory() {
        super("");
    }

    @Override
    public ThemeButton createThemeButton() {
        return new DarkButton();
    }

    @Override
    public ThemeToolBar createThemeToolBar() {
        return new DarkToolBar();
    }
}
