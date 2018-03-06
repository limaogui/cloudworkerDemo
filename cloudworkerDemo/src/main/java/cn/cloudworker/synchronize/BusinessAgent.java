package cn.cloudworker.synchronize;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoge(542637402@qq.com)
 * Date: 2018-03-05
 * Time: 11:19
 */
public class BusinessAgent implements Sell {

    private Vendor mvendor;

    public BusinessAgent(Vendor vendor){
        mvendor=vendor;
    }

    public void sell() {
        System.out.println("sell berfore");
        mvendor.sell();
        System.out.println("sell after");
    }

    public void ad() {
        System.out.println("ad before");
        mvendor.ad();
        System.out.println("ad after");

    }
}
