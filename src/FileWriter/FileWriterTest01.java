package FileWriter;

/**
 * java.io.Writer
 *      java.io.OutputStreamWriter;转换流（字节输出流-->字符输出流）
 *          java.io.FileWriter;文件字符输出流
 */
import java.io.*;
public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            //fw = new FileWriter("F:\\aaa.txt");//覆盖
            fw = new FileWriter("F:\\aaa.txt",true);//追加

            fw.write("hahaha");

            //将char数组的一部分写入
            char[] chars = {'我','是','中','国','人'};
            fw.write(chars,0,3);

            fw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
