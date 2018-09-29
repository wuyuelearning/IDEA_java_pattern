package patterns.clone.userlogin;

/**
 * Created by wuyue on 2018/9/29.
 */
public class Address {
    public String city;
    public String district;
    public String street;

    public Address(String city,String district,String street){
        this.city= city;
        this.district= district;
        this.street = street;
    }

    @Override
    public String toString() {
        return "[city ="+city+",district="+district+",street="+street+"]";
    }
}
