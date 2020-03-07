package Reflect;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取Class类型对象之后，可以创建该“类”的对象
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception{
        Class c1 = Class.forName("java.util.Date");
        Object o = c1.newInstance();
        if (o instanceof Date){
            Date t = (Date)o;
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));
        }
    }
}
