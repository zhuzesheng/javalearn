package FileReader;
/**
 * java.io.Reader
 *  java.io.InputStreamReader;转换流（字节输入流-->字符输入流）
 *      java.io.FileReader;文件字符输入流
 */

import java.io.*;
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("F:\\aaa.txt");
            //开始读
            char[] chars = new char[512];
            int temp = 0;
            while((temp = fr.read(chars))!=-1){
                //将char数组有效部分转换成字符串
                System.out.println(new String(chars,0,temp));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
