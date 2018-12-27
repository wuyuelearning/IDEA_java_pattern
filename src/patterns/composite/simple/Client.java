package patterns.composite.simple;

public class Client {
    public static void main(String[] args){

        Dir dir =new Folder("Dir");
        dir.addDir(new File("dir.txt"));

        Dir dirC =new Folder("C");
        dirC.addDir(new File("c.txt"));
        dir.addDir(dirC);

        Dir dirD =new Folder("D");
        dirD.addDir(new File("d.txt"));
        dir.addDir(dirD);

        Dir dirE =new Folder("E");
        dirE.addDir(new File("e.txt"));
        dir.addDir(dirE);

        Dir dirF =new Folder("F");
        dirF.addDir(new File("f.text"));
        dir.addDir(dirF);


        Dir dirG =new Folder("G");
        dirG.addDir(new File("g.text"));
        dir.addDir(dirG);

        dir.print();








    }
}
