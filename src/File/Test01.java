package File;

import java.io.File;

public class Test01 {
    public static void main(String[] args) throws Exception{
        File f1 = new File("F:\\aaa.txt");
        File f2 = new File("F:\\DE.txt");
        System.out.println(f1.exists());
        System.out.println(f2.exists());

        File f3 = new File("F:\\QQ");
        System.out.println(f3.exists());

        //如果不存在，创建
        if (!f3.exists()){
            f3.mkdir();//创建目录

            //创建文件 f3.createNewFile();

        }
    }
}
