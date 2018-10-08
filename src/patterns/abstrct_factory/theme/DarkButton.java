package patterns.abstrct_factory.theme;

/**
 * Created by wuyue on 2018/10/8.
 */
public class DarkButton extends ThemeButton {
    public DarkButton(String context) {
        super(context);
    }

    public  DarkButton(){
        super("");
    }

    @Override
    public void initTextColor() {
        System.out.println("drak button text color");
    }

    @Override
    public void initBackGroundColor() {
        System.out.println("drak button background color");
    }
}
