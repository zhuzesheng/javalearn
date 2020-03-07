package IOProperties;
/**
 * dbinfo这样的文件称为配置文件
 * 配置文件的作用就是：使程序更加灵活
 * 注意：一般在程序中可变的东西不要写死。推荐写到配置文件中。
 * 运行同样的程序得到不同的结果。
 * 像dbinfo这样具有特殊内容的配置文件又叫做属性文件要求属性文件以.properties结尾
 *
 */

import java.io.FileInputStream;
import java.util.Properties;

public class Test01 {
    public static void main(String[] args) throws Exception{
        //1、创建属性对象
        Properties p = new Properties();//和Map一样，只不过key和value只能存储字符串类型，key不能重复，若重复，value覆盖

        //2、创建输入流
        FileInputStream fis = new FileInputStream("F:\\dbinfo.txt");

        //3、将fis流中的所有数据加载到属性对象中
        p.load(fis);//所以现在属性对象中有（key=username,value=jack）

        //4、关闭流
        fis.close();
        //通过key获取value
        String v = p.getProperty("username");
        System.out.println(v);
    }
}
