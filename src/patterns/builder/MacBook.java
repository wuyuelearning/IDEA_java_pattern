package patterns.builder;

//  具体的Computer类 MacBook
public class MacBook extends Computer {

    protected MacBook(){

    }
    @Override
    public void setOS() {
        mOS = "Mac OS X 10.10";
    }
}
