package patterns.mvc.Simple2;



/**
 * Created by wuyue on 2018/12/29.
 *  改进后的MVC框架
 *
 *   View的职责更加单一
 *   Controller 增加监听Model状态改变的功能
 */
public class Main {
    public static void main(String[] args){

        Model model =new Model();
        View view =new View(model);
        new Controller(model,view);

    }
}
