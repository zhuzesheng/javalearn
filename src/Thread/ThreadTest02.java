package Thread;

/**
 *  在JAVA语言中实现多线程的第一种方法：
 *      第一步：继承java.lang.Thread;
 *      第二步：重写run方法
 *  三个知识点：
 *      如何定义线程？
 *      如何创建线程？
 *      如何启动线程？
 */

public class ThreadTest02 {
    public static void main(String[] args) {
        //创建线程
        Thread t = new Processor(); //多态

        //启动
        t.start(); //这段代码执行瞬间结束。告诉JVM在分配一个新的栈给t线程。
                   //run不需要程序员手动调用，系统线程启动之后自动调用run方法。

        //t.run();  //这是普通方法调用，这样做程序只有一个线程，run方法结束之后，下面程序才能继续执行。

        //这段代码在主线程中运行
        for (int i = 0;i<10;i++){
            System.out.println("main---" + i);
        }
        //main方法结束，程序可能还在运行
    }

}
//定义一个线程
class Processor extends Thread{
    //重写run方法
    public void run(){
        for(int i = 0;i<100;i++){
            System.out.println("run--" + i);
        }
    }
}