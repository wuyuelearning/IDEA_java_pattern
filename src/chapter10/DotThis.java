package chapter10;

import java.util.Random;

public class DotThis {
    private String j = "f";
    int k=10;
    public String l="sass";
    void f(){
        System.out.println("DotThis.f()");
    }

    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args){
        DotThis dotThis =new DotThis();
        DotThis.Inner inner  =dotThis.inner();
        inner.outer().f();
    }
}



