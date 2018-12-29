package patterns.mvc.Simple2;



import java.awt.*;

/**
 * Created by wuyue on 2018/12/29.
 */
public class Controller implements Model.OnStateChangeListener {
    private Model model;
    private View view;
    public Controller(Model model , View view){
        this.model =model;
        this.view =view;

        view.addLoadListener(e->model.ImageLoad());
        view.addClearListener(e->model.clear());

        view.setImage(model.getImage());
        model.setOnStateChangeListener(this);
    }

    @Override
    public void onStateChanged(Image image) {
        view.setImage(image);
    }
}
