package FileInputStream;
import java.io.*;
public class FileInputStream05 {
    public static void main(String[] args) throws IOException {
        //1、创建流
        FileInputStream fis = new FileInputStream("F:\\aaa.txt");
        System.out.println(fis.available());

        System.out.println(fis.read());

        //int available(); 返回流中剩余的估计字节数
        System.out.println(fis.available());//6

        //跳过2个字节
        fis.skip(2);
        System.out.println(fis.read());

        fis.close();
    }
}
