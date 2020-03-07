package Thread;

/**
 * t.join(成员方法) 必须使用引用.去调用
 * 线程合并
 */
public class ThreadTest11 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Processor11());

        t.setName("t");
        t.start();

        //合并线程
        //t.join();//t和主线程合并
        //主线程
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }
}
class  Processor11 implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }
}