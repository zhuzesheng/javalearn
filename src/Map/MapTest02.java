package Map;

/**
 * HashMap默认初始化容量是16，默认加载因子是0.75
 * Hashtable默认初始化容量是11，默认加载因子是0.75
 * java.util.Properties；也是由key和values组成，但是key和value都是字符串类型
 */
import java.util.Properties;
public class MapTest02 {
    public static void main(String[] args) {
        //1、创建属性类对象
        Properties p =new Properties();
        //2、存
        p.setProperty("driver","oracle");
        p.setProperty("username","sam");
        //注意key不能重复，如果重复则value覆盖
        p.setProperty("username","tim");
        p.setProperty("password","tiger");
        p.setProperty("url","jdbc:oracle:thin:");

        //3、取，通过key获取value

        String v1 = p.getProperty("driver");
        String v2 = p.getProperty("username");
        String v3 = p.getProperty("password");
        String v4 = p.getProperty("url");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);


    }
}
