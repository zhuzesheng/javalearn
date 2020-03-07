package BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * BufferedReader
 * InputStreamReader 转换流
 */
public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception{
        /*
        //创建带有缓冲区的字符输入流
        FileInputStream fis = new FileInputStream("F:\\aaa.txt");
        //转换流
        InputStreamReader  isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\aaa.txt")));
        //开始读
        String temp = null;
        while((temp=br.readLine())!=null){
            System.out.println(temp);
        }
        //关闭，关闭最外层的流即可 （装饰者模式）
        br.close();
    }
}
