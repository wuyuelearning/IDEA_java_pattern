package patterns.clone;

import java.util.ArrayList;

/**
 * Created by wuyue on 2018/9/28.
 */
public class WordDocument implements Cloneable {
    private String mText;
    private ArrayList<String> mImages = new ArrayList<>();
    private int mCount;
    private Integer mIng;

    public WordDocument() {
        System.out.println("-----------------Doucument 构造方法----------------------");
    }

    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            doc.mCount = this.mCount;
            doc.mIng = this.mIng;
//            doc.mImages= this.mImages; //  浅拷贝
            doc.mImages = (ArrayList<String>) this.mImages.clone(); //  深拷贝
            return doc;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Integer getIng() {
        return mIng;
    }

    public void setIng(Integer mIng) {
        this.mIng = mIng;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void setImages(ArrayList<String> mImages) {
        this.mImages = mImages;
    }

    public void addImags(String img) {
        this.mImages.add(img);
    }

    public int getCount() {
        return mCount;
    }

    public void setCount(int mCount) {
        this.mCount = mCount;
    }

    public void showDocument() {
        System.out.println("-----------------Word Content Start----------------------");

        System.out.println("Text: " + mText);
        System.out.println("Count : " + mCount);
        System.out.println("Integer : " + mIng);
        System.out.println("Image List : ");
        for (String img : mImages) {
            System.out.println("image name: " + img);
        }

        System.out.println("-----------------Word Content End----------------------");

    }
}
