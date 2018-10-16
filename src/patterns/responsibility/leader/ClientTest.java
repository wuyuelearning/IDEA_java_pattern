package patterns.responsibility.leader;

/**
 * Created by wuyue on 2018/10/12.
 */
public class ClientTest {
    public static void main(String[] args){
        GroupLeader groupLeader =new GroupLeader();
        Director  director =new Director();
        Manager manager =new Manager();
        Boss boss =new Boss();

        groupLeader.nextHandler=director;
        director.nextHandler= manager;
        manager.nextHandler = boss;

        groupLeader.handleRequest(5000);
    }
}
