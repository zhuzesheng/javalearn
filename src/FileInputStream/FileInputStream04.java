package FileInputStream;

import java.io.FileInputStream;

public class FileInputStream04 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("F:\\aaa.txt");

        //循环读取
        byte[] bytes = new byte[1024];//每次读取1KB
        /*
        while(true){
            int temp = fis.read(bytes);
            if (temp == -1) break;

            //将byte数组中有效的数据转换成字符串
            System.out.println(new String(bytes,0,temp));
        }

         */

        //升级循环
        int temp = 0;
        while((temp = fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,temp));
        }
        fis.close();
    }
}
