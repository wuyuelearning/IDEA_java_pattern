package patterns.builder;


public class BuilderTest {
    public static void main(String[] args) {


        Builder mBuilder = new MacBookBuilder();
        Director mDirector = new Director(mBuilder);
        mDirector.construct("intel", "Retina");
        System.out.println("Computer Info : " + mBuilder.create().toString());

        Computer2 mComputer2 = new Computer2.Builder()
                                .setBoard("intel")
                                .setDisplay("Retina")
                                 .create();
        System.out.println("Computer Info : " + mComputer2.toString());


        Computer2.Builder builder=new Computer2.Builder();
        builder.setBoard("intel");
        builder.setDisplay("Retina");
        builder.setOS("");
        Computer2 mComputer21= builder.create();

        System.out.println("Computer21 Info : " + mComputer21.toString());


        ComputerConfig computerConfig=new ComputerConfig.Builder().setBoard("intel").setOS("Mac").setDisplay("Retina").create();
        Computer3 computer3 =new Computer3();
        computer3.init(computerConfig);
        System.out.println("Computer Info : " + computer3.toString());
        System.out.println("Computer Info : " + computerConfig.toString());


        ComputerConfig.Builder builder1 =new ComputerConfig.Builder();
        builder1.setBoard("intel");
        builder1.setOS("Mac");
        builder1.setDisplay("Retina");
        ComputerConfig computerConfig1 =builder1.create();
        Computer3 computer31 =new Computer3(computerConfig1);
//        computer31.init(computerConfig1);
        System.out.println("Computer Info : " + computer31.toString());
        System.out.println("Computer Info : " + computerConfig1.toString());



    }
}
