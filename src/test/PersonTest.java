package test;

import java.io.Serializable;

/**
 * Created by wuyue on 2019/1/25.
 */
public class PersonTest implements Serializable {
    private static final long serialVersionUID =1243141234L;

    private String name;
    private PersonTest father;

    public PersonTest(String name) {
        this.name = name;
    }

    public PersonTest(String name, PersonTest father) {
        this.name = name;
        this.father = father;
    }


//    @Override
//    public PersonTest clone() {
//
//        PersonTest p = null;
//        try {
//            p = (PersonTest) super.clone();
//            p.setFather(new PersonTest(p.getFather().getName()));
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return p;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFather(PersonTest father) {
        this.father = father;
    }

    public PersonTest getFather() {
        return father;
    }
}

