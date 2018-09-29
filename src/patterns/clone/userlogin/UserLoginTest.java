package patterns.clone.userlogin;

/**
 * Created by wuyue on 2018/9/29.
 */
public class UserLoginTest {
    public static void main(String[] args){
        LoginImpl login =new LoginImpl();
        login.login();
        User user =LoginSession.getLoginSession().getLoginedUser();
        System.out.println("user info: "+user.toString());
        user.age=10;
        System.out.println("user info: "+user.toString());
        System.out.println("user info: "+LoginSession.getLoginSession().getLoginedUser().toString());
    }
}
