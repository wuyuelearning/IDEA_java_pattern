package chapter10;

public class Child extends DotThis {

    void fun(){
        System.out.println(l+"  "+k);
    }

    public static void main(String[] args){
        Child c =new Child();
        c.fun();
    }
}
