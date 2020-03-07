package Thread;

/**
 *  JAVA程序的运行原理？
 *      java命令会启动java虚拟机，启动JVM，等于启动了一个应用程序，表示启动了一个进程。该进程会自动启动一个“主线程”，然后主线程去调用
 *      某个类的main方法。所以main方法运行在主线程中。在此次之前所有程序都是单线程的。
 *  分析以下程序有几个线程？
 *      以下程序只有一个线程，就是主线程。
 *      main，m1，m2，m3这四个方法在同一个栈空间中。
 *      没有启动其他任何线程。
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        m2();
    }
    public static void m2(){
        m3();
    }
    public static void m3(){
        System.out.println("-------");
    }
}
