package cn.cloudworker.model;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoge(542637402@qq.com)
 * Date: 2018-03-06
 * Time: 20:31
 */
public class SingletonEHanChange {
    public static SingletonEHanChange singletonEHanChange=null;
    static {
        singletonEHanChange=new SingletonEHanChange();
    }
    public SingletonEHanChange(){};
    public static SingletonEHanChange getSingletonEHanChange(){
       return  singletonEHanChange;
    }


}
