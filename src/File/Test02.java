package File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class Test02 {
    public static void main(String[] args) {
        //1、获取绝对路径
        File f1 = new File("aaa.txt");
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);

        //2、获取文件名
        System.out.println(f1.getName());
        //3、获取父路径
        File f2 = new File("F:\\ideaproject\\javalearn\\aaa.txt");
        String parentPath = f2.getParent();
        System.out.println(parentPath);
        //4、判断该file是Directory还是file
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        //5、获取文件最后一次修改时间
        Date t =new Date(f1.lastModified());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));

    }
}
