package patterns.builder;

import patterns.clone.userlogin.Address;
import patterns.clone.userlogin.LoginImpl;
import patterns.clone.userlogin.LoginSession;
import patterns.clone.userlogin.User;

/**
 * Created by wuyue on 2018/9/29.
 */
public class CloneUserLoginTest {
    public static void main(String[] args) {
        LoginImpl login = new LoginImpl();
        login.login();


        User user = LoginSession.getLoginSession().getLoginedUser();
        System.out.println("user Info:" + user.toString());
        user.address = new Address("shanghai", "putuo", "zhenbei");
        System.out.println("user Info:" + user.toString());
        //  如果不用原型模式（clone）原来的LoginSession.getLoginSession().getLoginedUser()，这部分也会被修改
        System.out.println("user Info:" + LoginSession.getLoginSession().getLoginedUser().toString());
//        User user2 = user;
//        user2.age=10;
//        System.out.println("user Info:" + LoginSession.getLoginSession().getLoginedUser().toString());
//        System.out.println("user Info:" + user.toString());
//        System.out.println("user2 Info:" + user2.toString());

    }
}
