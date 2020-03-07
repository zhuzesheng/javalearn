package Thread;

public class ThreadTest16 {
    public static void main(String[] args) throws Exception{
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        Processor16 p1 = new Processor16(mc1);
        Processor16 p2 = new Processor16(mc2);

        Thread t1 = new Thread(p1);
        t1.setName("t1");
        Thread t2 = new Thread(p2);
        t2.setName("t2");

        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}
class Processor16 implements Runnable
{
    MyClass mc;
    Processor16(MyClass mc){
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
class MyClass1{
    public synchronized void m1(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1....");

    }

    //m2方法不会等m1方法结束，t1，t2不共享同一个mc
    public synchronized void m2(){
        System.out.println("m2...");
    }
}