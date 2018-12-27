package patterns.composite.common2;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
    }

    @Override
    public void addChild(Component c) {
        System.out.println("no leaf");
//        throw new UnsupportedOperationException("no left");
    }

    @Override
    public void removeChild(Component c) {
//        throw new UnsupportedOperationException("no left");

    }

    @Override
    public Component getChild(int index) {
//        throw new UnsupportedOperationException("no left");
        return null;
    }
}
