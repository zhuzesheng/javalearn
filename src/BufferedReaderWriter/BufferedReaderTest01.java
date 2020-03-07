package BufferedReaderWriter;

/**
 * 字节
 * BufferedInputStream;
 * BufferedOutputStream;
 *
 * 字符
 * BufferedReader;  带有缓冲区的字符输入流
 * BufferedWriter;  带有缓冲区的字符输入流
 */
import java.io.*;
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception{
        //创建一个带有缓冲区的字符输入流
        //FileReader fr = new FileReader("F:\\aaa.txt");//创建一个文件字符流
        //BufferedReader br = new BufferedReader(fr); //将文件字符输入流包装成带有缓冲区的字符输入流

        //根据流出现的位置，流又可以分为：包装流或者处理流 和 节点流
        //BufferedReader br 是一个包装流，或者处理流
        BufferedReader br = new BufferedReader(new FileReader("F:\\aaa.txt"));

        //开始读
        String temp = null;
        while ((temp = br.readLine())!=null){ //br.readerLine()方法读取一行，但是行尾不带换行符
            System.out.println(temp);  //输出一行
        }
        //关闭
        //注意：关闭的时候只需要关闭最外层的包装流。（这里有一个装饰者模式）
        br.close();
    }
}
