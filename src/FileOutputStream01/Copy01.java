package FileOutputStream01;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 关于文件的复制粘贴
 */
public class Copy01 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("F:\\aaa.txt");
        FileOutputStream fos = new FileOutputStream("F:\\bbb.txt");

        //一边读，一遍写
        byte[] bytes = new byte[1024];
        int temp = 0;
        while((temp = fis.read(bytes))!=-1){
            //将byte数组中的内容直接写入
            fos.write(bytes,0,temp);
        }
        //刷新
        fos.flush();

        fis.close();
        fos.close();
    }
}
