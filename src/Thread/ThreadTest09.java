package Thread;

/**
 * 如何正确的更好地终止一个正在执行的进程
 * 需求：线程启动5s之后终止
 */
public class ThreadTest09 {
    public static void main(String[] args) throws InterruptedException {

        Processor9 p = new Processor9();
        Thread t = new Thread(p);
        t.setName("t");
        t.start();

        //5s之后终止
        Thread.sleep(5000);
        //终止
        p.run = false;

    }
}
class Processor9 implements Runnable{
    boolean run = true;
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            if(run){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"----"+i);
            }else {
                return;
            }

        }
    }
}