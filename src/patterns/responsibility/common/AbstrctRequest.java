package patterns.responsibility.common;

/**
 * Created by wuyue on 2018/10/12.
 */
public abstract  class AbstrctRequest {
    private Object object;  //  处理对象

    public AbstrctRequest(Object o){
        this.object =o;
    }

    /**
     * 获取处理的内容对象
     */

    public Object getContent(){
        return object;
    }

    /**
     *  获得请求级别
     */

    public abstract int getRequestLevel();
}
