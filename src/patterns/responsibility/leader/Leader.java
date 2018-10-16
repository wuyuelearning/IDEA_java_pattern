package patterns.responsibility.leader;

/**
 * Created by wuyue on 2018/10/12.
 */
public abstract class Leader {
    Leader nextHandler;

    /**
     *  处理报账
     */

    public final void handleRequest(int money){
        if(money<= limit()){
            handle(money);
        } else {
            if(nextHandler!=null){
                nextHandler.handle(money);
            } else {
                System.out.println("No");
            }
        }
    }

    /**
     *  自身能批复的额度权限
     */
    abstract  int limit();

    /**
     * 处理报账行为
     */
    abstract void handle(int money);
}
