package Thread;

public class ThreadTest18 {
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        Thread t1 = new Thread(new Processor18(mc1));
        Thread t2 = new Thread(new Processor18(mc2));

    }
}
class Processor18 implements Runnable {
    MyClass mc;
    Processor18(MyClass mc){
        this.mc = mc;
    }

    public void run(){
        if ("t1".equals(Thread.currentThread().getName())){
            mc.m1(); //用的还是类锁，与对象锁无关
        }
        if ("t2".equals(Thread.currentThread().getName())){
            mc.m2();
        }

    }

}
class MyClass3{
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