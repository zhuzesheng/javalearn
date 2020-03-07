package ReflectIOProperties;

import java.io.FileReader;
import java.util.Properties;

public class Test01 {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        FileReader fr = new FileReader("F:\\classInfo.properties");
        p.load(fr);
        fr.close();
        String className = p.getProperty("className");
        //System.out.println(className);
        //通过反射机制创建对象
        Class c = Class.forName(className);
        //创建对象
        Object o = c.newInstance();
        System.out.println(o);
    }
}
