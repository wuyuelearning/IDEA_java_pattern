package test;

/**
 * Created by wuyue on 2019/1/15.
 */
public class CodeBlock {
    {
        System.out.println("构造块");
    }
    public  CodeBlock(){
     this(1);
     System.out.println(" null");

    }
    public  CodeBlock(int i){
        this("we");
        System.out.println(" int");
    }

    public CodeBlock(String s){
        System.out.println(" String ");
    }
}
