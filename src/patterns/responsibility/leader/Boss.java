package patterns.responsibility.leader;

/**
 * Created by wuyue on 2018/10/12.
 */
public class Boss extends Leader {
    @Override
    int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    void handle(int money) {
        System.out.println("Boss批复"+money+"元");
    }
}
