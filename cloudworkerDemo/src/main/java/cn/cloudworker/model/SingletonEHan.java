package cn.cloudworker.model;

/**
 * Created with IntelliJ IDEA.
 * Description:饿汉
 * User: maoge(542637402@qq.com)
 * Date: 2018-03-06
 * Time: 20:29
 */
public class SingletonEHan {
    public static SingletonEHan singleton=new SingletonEHan();
    public SingletonEHan(){};
    public static SingletonEHan getSingletonEHan(){
        return singleton;
    }

}
