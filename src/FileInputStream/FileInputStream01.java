package FileInputStream;
/**
 *
 */

import java.io.*;
public class FileInputStream01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //1、要读取某文件，先与这个文件创建一个“输入流”
            String filePath = "F:\\aaa.txt";
            fis = new FileInputStream(filePath);
            //2、开始读
            int i1 = fis.read();
            int i2 = fis.read();
            System.out.println(i1);
            System.out.println(i2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //为了保证流一定会释放，所以在finally语句块中执行
            if (fis!= null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
