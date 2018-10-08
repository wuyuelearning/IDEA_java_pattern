package patterns.abstrct_factory.theme;

import patterns.abstrct_factory.commom.AbstractProductA;

/**
 * Created by wuyue on 2018/10/8.
 */
public abstract class AbstractThemeFactory {

    protected String context;

    public AbstractThemeFactory(String context) {

        this.context =context;
    }

    public abstract ThemeButton createThemeButton();

    public abstract ThemeToolBar createThemeToolBar();
}
