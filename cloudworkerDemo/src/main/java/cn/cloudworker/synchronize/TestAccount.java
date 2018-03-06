package cn.cloudworker.synchronize;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoge(542637402@qq.com)
 * Date: 2018-03-05
 * Time: 15:38
 */
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("limaogui",1000.0f);
        AccountOperator accountOperator = new AccountOperator(account);
        final int num=5;
        Thread thread[]=new Thread[num];
        for (int i = 0; i <num ; i++) {
            thread[i]=new Thread(accountOperator,"thread"+i);
            thread[i].start();
        }
    }
}
