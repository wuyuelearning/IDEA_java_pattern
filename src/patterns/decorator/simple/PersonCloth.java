package patterns.decorator.simple;

/**
 * Created by wuyue on 2018/11/29.
 */
public  abstract class PersonCloth extends Person {

    private Person person ;

    public PersonCloth(Person person){
        this.person = person;
    }


    @Override
    public void dressed() {
        person.dressed();
    }
}
