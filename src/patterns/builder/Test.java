package patterns.builder;

public class Test {
    public static void main(String[] args){


        Builder mBuilder = new MacBookBuilder();
        Director mDirector= new Director(mBuilder);
        mDirector.construct("intel","Retina");
        System.out.println("Computer Info : "+mBuilder.create().toString());

        Computer2 mComputer2 =new  Computer2.Builder().setBoard("intel").setDisplay("Retina").create();
        System.out.println("Computer Info : "+mComputer2.toString());

    }
}
