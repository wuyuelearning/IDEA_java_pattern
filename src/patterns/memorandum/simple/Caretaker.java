package patterns.memorandum.simple;

/**
 * Created by wuyue on 2018/10/24.
 */
public class Caretaker  {
    Memoto memoto; //  备忘录

    /**
     *  存档
     */
    public void archive(Memoto memoto){
        this.memoto =memoto;
    }

    /**
     *  获取存档
     */
    public Memoto getMemoto(){
        return  memoto;
    }

}
