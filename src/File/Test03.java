package File;

import java.io.File;

/**
 * 使用递归找出某目录下的所有子目录以及子文件
 */

public class Test03 {
    public static void main(String[] args) throws Exception{

        File f = new File("F:\\ideaproject");
        method1(f);
    }
    public static void method1(File f){
        if(f.isFile()){
            return;
        }
        //f有两种可能，f是文件，也可能是目录
        //先当做目录
        File[] fs = f.listFiles();
        for (File subF:fs){
            System.out.println(subF.getAbsolutePath());
            method1(subF);
        }
    }
}
