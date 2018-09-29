package patterns.clone.userlogin;

/**
 * Created by wuyue on 2018/9/29.
 */
public class LoginSession {

    static LoginSession loginSession =null;
    private User user;

    private LoginSession(){

    }
    public static LoginSession getLoginSession(){
        if(loginSession == null){
            loginSession =  new LoginSession();
        }
        return loginSession;
    }

    void setLoginedUser(User user){
        this.user = user;
    }

    public User getLoginedUser() {
//        return this.user;
        return (User) user.clone();
    }
}
