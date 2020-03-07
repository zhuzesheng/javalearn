package Thread;

/**
 * 类锁，类只有一个，所以类锁是类级别的，只有一个。
 */
public class ThreadTest17 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Processor17());
        Thread t2 = new Thread(new Processor17());

    }
}
class Processor17 implements Runnable {
    public void run(){
        if ("t1".equals(Thread.currentThread().getName())){
            MyClass2.m1();
    }
    if ("t2".equals(Thread.currentThread().getName())){
        MyClass2.m2();
    }

}

}
class MyClass2{
    //
    public synchronized static void m1(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1----");
    }
    /**
    //不会等m1结束，因为该方法没有被synchronized修饰
    public static void m2(){
        System.out.println("m2----");
    }
     */
    //m2方法等m1结束之后才能执行，该方法有synchronized
    //线程执行该代码需要类锁，而类锁只有一个
    public synchronized static void m2(){
        System.out.println("m2----");
    }
}