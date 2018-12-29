package patterns.mvc.Simple;

/**
 * Created by wuyue on 2018/12/29.
 */
public class Controller {
    private Model model;
    private View view;
    public Controller(Model model ,View view){
        this.model =model;
        this.view =view;

        view.addLoadListener(e->model.ImageLoad());
        view.addClearListener(e->model.clear());
    }
}
