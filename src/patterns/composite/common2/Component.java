package patterns.composite.common2;

public abstract  class Component {
    protected String name;

    public Component (String name){
        this.name = name;
    }

    public abstract void doSomething();

    public abstract void addChild(Component c );

    public abstract void removeChild(Component c );

    public abstract Component getChild(int index);


}
