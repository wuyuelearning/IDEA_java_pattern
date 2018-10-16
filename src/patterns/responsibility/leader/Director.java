package patterns.responsibility.leader;

/**
 * Created by wuyue on 2018/10/12.
 */
public class Director extends Leader {
    @Override
    int limit() {
        return 5000;
    }

    @Override
    void handle(int money) {
        System.out.println("Director批复"+money+"元");
    }
}
