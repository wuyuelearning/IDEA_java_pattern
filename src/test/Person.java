package test;

/**
 * Created by wuyue on 2019/1/15.
 */
public class Person {

    private static String name;
    private Home home;

    public Person(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    private static void job(){

    }

    public class Home {
        private String address;
        private String tel;

        public Home(String address,String tel){
            this.address =address;
            this.tel =tel;
        }


        public  String getAddress() {
            job();
            return name;
        }
        private  void some(){
            job();
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }
    }
}
