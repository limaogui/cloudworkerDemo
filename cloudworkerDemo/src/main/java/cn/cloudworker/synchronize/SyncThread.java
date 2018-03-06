package cn.cloudworker.synchronize;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoge(542637402@qq.com)
 * Date: 2018-03-05
 * Time: 15:11
 */
public class SyncThread implements Runnable {

    private static int count;
    public SyncThread(){
        count=0;
    }

    public void countAdd(){
        synchronized (this){
            for (int i = 0; i <5 ; i++) {
                System.out.println(Thread.currentThread().getName()+":"+count++);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printCount(){
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+""+count);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void method(){
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+count++);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    public void run() {
//        String thredName = Thread.currentThread().getName();
//        if(thredName.equals("A")){
//            countAdd();
//        }else{
//            printCount();
//        }
        method();

    }
    public int getCount(){
        return  count;
    }

}
