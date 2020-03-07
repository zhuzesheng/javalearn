package FileOutputStream01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  java.io.OutputStream;
 *     java.io.FileOutStream; 文件字节输出流
 */
public class FileOutputStream01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //1、创建文件字节输出流
            //谨慎使用，谁将原文件覆盖
            //fos = new FileOutputStream("F:\\aaa.txt");
            //以追加的方式写入
            fos = new FileOutputStream("F:\\aaa.txt",true);

            //2、开始写
            String msg = "HelloWord";

            //将String转换成byte数组
            byte[] bytes = msg.getBytes();
            fos.write(bytes);
            //将byte数组的一部分写入
            //fos.write(bytes,0,3);

            //推荐最后的时候为了保证数据完全写入硬盘，所以要刷新
            fos.flush();


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
