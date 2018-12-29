package patterns.mvc.Simple;

/**
 * Created by wuyue on 2018/12/29.
 *
 *  MVC 框架
 *
 */
public class Main {
    public static void main(String[] args){

        Model model =new Model();
        View view =new View(model);
        model.setOnStateChangeListener(view);
        new Controller(model,view);

    }
}
