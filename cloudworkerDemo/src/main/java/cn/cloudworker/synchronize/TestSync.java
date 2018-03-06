package cn.cloudworker.synchronize;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoge(542637402@qq.com)
 * Date: 2018-03-05
 * Time: 15:15
 */
public class TestSync {

    public static void main(String[] args) {
        SyncThread sync1=new SyncThread();
        SyncThread sync2 =new SyncThread();
        Thread thread1 =new Thread(sync1,"A");
        Thread thread2 = new Thread(sync2,"B");
        thread1.start();
        thread2.start();
    }
}
