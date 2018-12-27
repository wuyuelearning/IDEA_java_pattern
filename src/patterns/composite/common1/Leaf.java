package patterns.composite.common1;

public class Leaf extends Component {


    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
    }
}
