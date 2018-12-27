package patterns.composite.common1;

public class Client {
    public static void main(String[] args){
        Composite root = new Composite("Root");

        Composite branch1 = new Composite("branch1");
        Composite branch2= new Composite("branch2");

        Leaf leaf1 =new Leaf("leaf1");
        Leaf leaf2 =new Leaf("leaf2");

        root.addChild(branch1);
        root.addChild(branch2);

        root.removeChild(branch1);

        branch1.addChild(leaf1);
        branch2.addChild(leaf2);

        branch1.doSomething();
//        root.doSomething();

//      System.out.println( branch1.getChild(0).getName());


    }
}
