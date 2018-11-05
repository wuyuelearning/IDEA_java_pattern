package patterns.memorandum.simple;

/**
 * Created by wuyue on 2018/10/22.
 *
 *  游戏存档功能：
 *  首先建立游戏类（CallOfDuty），备忘录类，Caretaker类，玩游戏到某个节点对游戏进行存档
 *  然后退出游戏，再重新进入时从存档中读取进度，并进入存档时的进度
 */
public class Client {
    public static void main(String[] args){


        CallOfDuty game = new CallOfDuty();
        game.play();

        Caretaker caretaker =new Caretaker();
        //  存档
        caretaker.archive(game.createMemoto());
        game.quit();
        // 恢复游戏数据
        CallOfDuty game2 = new CallOfDuty();
        game2.restore(caretaker.getMemoto());

        game2.setCheckpoint(20);
        game2.setLifeValue(80);
        game2.setWeapon("weapone2");
        System.out.println(game2.toString());

        game2.restore(caretaker.getMemoto());
    }
}
