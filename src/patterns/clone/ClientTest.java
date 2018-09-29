package patterns.clone;

/**
 * Created by wuyue on 2018/9/28.
 */
public class ClientTest {
    public static void main(String[] args){

        Integer i = new Integer(100);
        Integer i2 = new Integer(200);
        WordDocument originDoc = new WordDocument();

        originDoc.setText("第一篇文档");
        originDoc.setCount(10);
        originDoc.setIng(i);
        originDoc.addImags("pic 1");
        originDoc.addImags("pic 2");
        originDoc.addImags("pic 3");
        originDoc.addImags("pic 4");
        originDoc.showDocument();
        System.out.println("origin :"+originDoc.toString());

        WordDocument doc2 = originDoc.clone();
        doc2.showDocument();
        System.out.println("doc2: "+doc2.toString());

        doc2.setText("第二篇文档");
        doc2.setCount(20);
        doc2.setIng(i2);
        //  浅拷贝 则在originDoc中也会改变array对象，加入pic5
        //  深拷贝 在originDoc不会出现pic5
        doc2.addImags("pic5");
        doc2.showDocument();
        System.out.println("doc2: "+doc2.toString());

        originDoc.showDocument();
        System.out.println("origin :"+originDoc.toString());
    }
}
