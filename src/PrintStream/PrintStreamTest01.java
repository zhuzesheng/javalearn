package PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.PrintStream; 标准的输出流，默认打印到控制台，以字节方式
 * java.io.PrintWriter;以字符方式
 */
public class PrintStreamTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        //默认是输出到控制台的，可以改变输出方向
        System.out.println("HelloWorld");

        PrintStream ps = System.out;
        ps.println("java");

        //改变输出方向
        System.setOut(new PrintStream(new FileOutputStream("F:\\log.txt")));
        //再次输出
        System.out.println("hahaha");

        //通常使用上面的方法记录日志
        //需求：记录日志，m1方法开始执行的时间和结束的时间，记录到log文件中
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println("m1方法开始执行"+sdf.format(new Date()));
        m1();
        System.out.println("m1方法执行结束"+sdf.format(new Date()));
    }
    public static void m1(){
        System.out.println("m1 method execute!");
    }
}
