package chapter9;

public class Apply2 {
    public static void process(Processor p, Object s){
        System.out.println("Using Process "+p.name());
        System.out.println(p.process(s));
    }
}
