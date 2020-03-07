package Thread;

public class ThreadTest07 {
    public static void main(String[] args) throws InterruptedException {
        //创建线程
        Thread t = new Processor();
        //启动线程
        t.start();
        //休眠
        t.sleep(500); // 等同于Thread.sleep(); 阻塞的还是当前线程，和t线程无关。

        System.out.println("HelloWorld");
    }
}
class Processor5 extends Thread{
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }
}
