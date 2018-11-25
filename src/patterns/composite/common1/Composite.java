package patterns.composite.common1;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> list =new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if(null != list){
            for(Component c :list)
            c.doSomething();
        }
    }

    public void addChild(Component child){
        list.add(child);
    }

    public void removeChild(Component child){
        list.remove(child);
    }

    public Component getChild(int index){
        return list.get(index);
    }

}
