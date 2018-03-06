package cn.cloudworker.model;

/**
 * Created with IntelliJ IDEA.
 * Description:赖汉线程安全
 * User: maoge(542637402@qq.com)
 * Date: 2018-03-06
 * Time: 20:22
 */
public class SingletonSync {

    public static SingletonSync singletonSync;
    public SingletonSync(){};
    public static synchronized SingletonSync getSingletonSync(){
      if(singletonSync==null){
          singletonSync=new SingletonSync();
      }
        return  singletonSync;
    }
}
