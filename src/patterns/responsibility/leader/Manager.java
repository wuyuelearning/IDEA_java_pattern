package patterns.responsibility.leader;

/**
 * Created by wuyue on 2018/10/12.
 */
public class Manager extends Leader{
    @Override
    int limit() {
        return 10000;
    }

    @Override
    void handle(int money) {
        System.out.println("Manager批复"+money+"元");
    }
}
