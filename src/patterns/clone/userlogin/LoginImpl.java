package patterns.clone.userlogin;

/**
 * Created by wuyue on 2018/9/29.
 */
public class LoginImpl implements Login {
    @Override
    public void login() {
        User loginedUser =new User();
        loginedUser.age=22;
        loginedUser.name = "tom";
        loginedUser.phoneNum="111";
        loginedUser.address = new Address("beijing","haidian","huayuandonglu");

        LoginSession.getLoginSession().setLoginedUser(loginedUser);

    }
}
