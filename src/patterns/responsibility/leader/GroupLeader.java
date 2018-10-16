package patterns.responsibility.leader;

/**
 * Created by wuyue on 2018/10/12.
 */
public class GroupLeader extends Leader {
    @Override
    int limit() {
        return 1000;
    }

    @Override
    void handle(int money) {
        System.out.println("GroupLeader批复"+money+"元");
    }
}
