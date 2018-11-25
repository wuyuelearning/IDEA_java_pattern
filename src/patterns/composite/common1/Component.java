package patterns.composite.common1;

public abstract class Component {
    protected String name;

    public Component (String name){
        this.name =name;
    }

    public String getName(){
        return  this.name;
    }

    public  abstract void doSomething();
}
