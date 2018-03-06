package cn.cloudworker.model;

/**
 * Created with IntelliJ IDEA.
 * Description:懒汉 线程不安全
 * User: maoge(542637402@qq.com)
 * Date: 2018-03-06
 * Time: 20:18
 */
public class Singleton {

    public Singleton(){};

    private static Singleton singleton;

    public  static Singleton getSingleton(){
      if(singleton==null){
          singleton=new Singleton();
      }
        return singleton;
    }
}
