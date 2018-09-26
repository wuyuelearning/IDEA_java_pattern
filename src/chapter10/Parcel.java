package chapter10;

public class Parcel{

    class Contents{
        private int i=1;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            this.label =whereTo;
        }
        String readLabel(){
            return label;
        }
    }
    private Destination to(String s){
        return new Destination(s);
    }
    private Contents contents(){
        return new Contents();
    }

    private void ship(String dest){
        Contents c= contents();
        Destination d= to(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args){
         Parcel p= new Parcel();
         p.ship("how");
         Parcel q =new Parcel();
         Parcel.Destination d =q.to("can");
         Parcel.Contents c =q.contents();
    }
}

