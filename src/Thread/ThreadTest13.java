package Thread;
/**
 *   以下程序演示取款例子。以下程序使用线程同步机制
 */
public class ThreadTest13 {
    public static void main(String[] args) throws InterruptedException {
        //创建一个公共的账户
        Account act = new Account("actno-001",5000.0);
        //创建线程对同一个账户取款
        Thread t1 = new Thread(new Processor13(act));
        Thread t2 = new Thread(new Processor13(act));

        t1.start();
        t1.join();
        t2.start();

    }
}
//取款线程
class Processor13 implements Runnable{
    //账户
    Account act;

    //Constructor
    Processor13( Account act){
        this.act = act;
    }

    @Override
    public void run() {
        act.withdraw(1000);
        System.out.println("取款1000成功，余额："+act.getBalance());
    }
}
//账户
class Account1{
    private String actno;
    private  double balance;
    public Account1(){}
    public Account1(String actno,double balance){
        this.actno = actno;
        this.balance = balance;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getActno(){
        return actno;
    }

    public double getBalance() {
        return balance;
    }

    //对外提供一个取款的方法
    public void withdraw(double money){

        //把需要同步的代码，放到同步语句块中
        /**
         * 原理：t1线程和t2线程
         * t1线程执行到此处，遇到了synchronized关键字，就会去找this的对象锁，如果找到this对象锁，则进入同步语句快中执行程序。
         * 当同步语句块中的代码执行结束之后，t1线程归还this的对象锁。
         *
         * 在t1线程执行同步语句块的过程中，如果t2线程也过来执行以下代码，也遇到synchronized关键字，
         * 所以也去找this的对象锁，但是该对象锁被t1线程持有，只能在这等待this对象的归还。
         *
         */
        synchronized (this){
            double after = balance - money;
            //延迟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //更新
            this.setBalance(after);
        }



    }
}