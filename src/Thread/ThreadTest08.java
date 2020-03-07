package Thread;

/**
 * 某线程正在休眠，如何打断
 * 以下方式依靠的是异常处理机制
 */
public class ThreadTest08 {
    public static void main(String[] args) throws InterruptedException {
        //需求：启动线程，5s之后打断线程的休眠
        Thread t = new Thread(new Processor8());

        t.setName("t");
        t.start();
        Thread.sleep(5000);

        //打断t的睡眠
        t.interrupt();
    }
}
class Processor8 implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }

}