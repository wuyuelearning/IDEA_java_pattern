package patterns.builder;

// Director类 负责构建Computer

public class Director {

    Builder mBuilder =null;

    public Director (Builder builder){
        mBuilder=builder;
    }

    /**
     *  构建对象
     */

    public void construct(String board,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
