package Thread;

public class ThreadTest14 {
    public static void main(String[] args) throws InterruptedException {
        //创建一个公共的账户
        Account act = new Account("actno-001",5000.0);
        //创建线程对同一个账户取款
        Thread t1 = new Thread(new Processor14(act));
        Thread t2 = new Thread(new Processor14(act));

        t1.start();
        t1.join();
        t2.start();

    }
}
//取款线程
class Processor14 implements Runnable{
    //账户
    Account act;

    //Constructor
    Processor14( Account act){
        this.act = act;
    }

    @Override
    public void run() {
        act.withdraw(1000);
        System.out.println("取款1000成功，余额："+act.getBalance());
    }
}
//账户
class Account2{
    private String actno;
    private  double balance;
    public Account2(){}
    public Account2(String actno,double balance){
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
    //synchronized关键字添加到成员方法上，线程拿走的也是this的对象锁。
    public synchronized void withdraw(double money){

        //把需要同步的代码，放到同步语句块中

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