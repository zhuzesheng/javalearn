package Thread;

/**
 *  关于线程的优先级
 *
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        //如何获取当前线程对象？
        Thread t = Thread.currentThread(); //t保存的内存地址指向的线程是“主线程对象”

        //获取线程的名字
        System.out.println(t.getName());

        Processor2 p = new Processor2();
        Thread t1 = new Thread(p);
        //给线程起名
        t1.setName("t1");
        t1.start();

    }
}
class Processor2 implements Runnable{

    @Override
    public void run() {
        Thread t = Thread.currentThread(); //t保存的内存地址指向的线程是“t1线程对象”
        System.out.println(t.getName());
    }
}