package patterns.abstrct_factory.theme;


/**
 * Created by wuyue on 2018/10/8.
 */
public class ClientTest {

    public static void main(String[] args){
        AbstractThemeFactory factory1 =new DarkThemeFactory();
        factory1.createThemeButton().initTextColor();
        factory1.createThemeButton().initBackGroundColor();
        factory1.createThemeToolBar().initIcon();
        factory1.createThemeToolBar().initTextColor();
        factory1.createThemeToolBar().initBackGroundColor();

        System.out.println("--------------------");

        AbstractThemeFactory factory2 =new LightThemeFactory();
        factory2.createThemeButton().initTextColor();
        factory2.createThemeButton().initBackGroundColor();
        factory2.createThemeToolBar().initIcon();
        factory2.createThemeToolBar().initTextColor();
        factory2.createThemeToolBar().initBackGroundColor();
    }

}
