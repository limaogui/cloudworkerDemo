package cn.cloudworker.model;

/**
 * Created with IntelliJ IDEA.
 * Description:静态内部类方式
 * User: maoge(542637402@qq.com)
 * Date: 2018-03-06
 * Time: 20:37
 */
public class SingletonInnerClass {

    private static class SingletonHolder{
        private  static  final SingletonInnerClass instance = new SingletonInnerClass();
    }
    public SingletonInnerClass(){};

    public static  final SingletonInnerClass getSingletonHolder(){
        return SingletonHolder.instance;
    }

}
