package Thread;

/**
 * 守护线程
 * 其他所有的用户线程结束，则守护线程退出
 * 守护线程一般都是无限执行
 */
public class ThreadTest19 {
    public static void main(String[] args) throws Exception{
        Thread t1 = new Processor19();
        t1.setName("t1");
        //将t1这个用户线程修改成守护线程
        t1.setDaemon(true);
        t1.start();
        //主线程
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"---"+i);
            Thread.sleep(1000);
        }
    }
}
class Processor19 extends Thread{

    @Override
    public void run() {
        int i = 0;
        while (true){
            i++ ;
            System.out.println(Thread.currentThread().getName()+"---"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}