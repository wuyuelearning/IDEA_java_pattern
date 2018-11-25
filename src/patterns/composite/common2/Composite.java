package patterns.composite.common2;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> list = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if (null != list) {
            for (Component c : list)
                c.doSomething();
        }
    }

    @Override
    public void addChild(Component c) {
        list.add(c);
    }

    @Override
    public void removeChild(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int index) {
        return list.get(index);
    }
}
