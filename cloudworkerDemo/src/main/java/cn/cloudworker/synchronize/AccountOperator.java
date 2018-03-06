package cn.cloudworker.synchronize;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoge(542637402@qq.com)
 * Date: 2018-03-05
 * Time: 15:37
 */
public class AccountOperator implements Runnable {
    private Account account;
    public AccountOperator(Account account) {
        this.account = account;
    }

    public void run() {
        synchronized (account) {
            account.deposit(500);
            account.withdraw(500);
            System.out.println(Thread.currentThread().getName() + ":" + account.getBalance());
        }
    }
}
