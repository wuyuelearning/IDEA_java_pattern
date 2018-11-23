package test;

/**
 * Created by wuyue on 2018/11/20.
 */
public interface IConcrete {

    public static final S s = new S() {
        @Override
        public void doSomething() {
            System.out.println("aaaaa");
        }
    };

}
