package Thread;

public class ThreadTest15 {
    public static void main(String[] args) throws Exception{
        MyClass mc = new MyClass();
        Processor15 p = new Processor15(mc);

        Thread t1 = new Thread(p);
        t1.setName("t1");
        Thread t2 = new Thread(p);
        t2.setName("t2");

        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}
class Processor15 implements Runnable
{
    MyClass mc;
    Processor15(MyClass mc){
        this.mc = mc;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")){
            mc.m1();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.m2();
        }
    }
}
class MyClass{
    public synchronized void m1(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1....");

    }
    /**
    //m2方法的执行不需要等m1的结束，因为m2方法上没有synchronized
    public void m2(){
        System.out.println("m2...");
    }
     */
    //m2方法会等m1方法结束，t1，t2共享同一个mc，并且m1和m2方法上都有synchronized
    public synchronized void m2(){
        System.out.println("m2...");
    }
}