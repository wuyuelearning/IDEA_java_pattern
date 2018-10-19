package test;

/**
 * Created by wuyue on 2018/10/19.
 */
public class TestEnum {
    public static void main(String[] args){


        System.out.println("TYPE.JAVA: "+TYPE.JAVA);
        System.out.println("TYPE.TYPE.JAVA.name(): "+TYPE.JAVA.name());
        System.out.println("TYPE.TYPE.JAVA.name: "+TYPE.JAVA.name);
        System.out.println("TYPE.TYPE.JAVA.getName(): "+TYPE.JAVA.getName());
        System.out.println("TYPE.TYPE.getName(\"JAVA\"): "+TYPE.getName("JAVA"));

    }

    public enum TYPE{

        C("c"),JAVA("java"),RUBY("ruby"),PHYTHON("phython");

        private  String name;
        TYPE(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static  String getName(String name){
            for(TYPE type :TYPE.values()){
                if(type.name.equals(name)){
                    return type.getName();
                }
            }
            return name;
        }
    }

}
