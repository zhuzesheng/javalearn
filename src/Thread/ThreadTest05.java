package Thread;

/**
 * 线程优先级高的获取的CPU时间片相对多一些。
 * 优先级：1-10
 * 最低1，最高10，默认5
 */
public class ThreadTest05 {
    public static void main(String[] args) {

        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);



        Thread t1 = new Processor3();
        t1.setName("t1");

        Thread t2 = new Processor3();
        t2.setName("t2");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        //设置优先级
        t1.setPriority(5);
        t2.setPriority(6);
        //启动
        t1.start();
        t2.start();
    }
}
class Processor3 extends Thread{
    @Override
    public void run() {
        for (int i = 0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }
}