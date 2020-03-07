package Reflect;
/**
 * java.lang.reflect.Field;类中的属性
 */

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest04 {
    public static void main(String[] args) {
        //获取整个类
        Class c = null;
        try {
            c = Class.forName("Reflect.User");   //要导包！！！！！！
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //获取属性Field
        /*获取所有public修饰的属性
        Field[] fs = c.getFields();
        System.out.println(fs.length);
        System.out.println(fs[0].getName());
         */
        //获取所有的属性
        Field[] fs = c.getDeclaredFields();
        /**for (Field field:fs){
            int i = field.getModifiers();
            String strModifier = Modifier.toString(i);
            System.out.println(strModifier);
            Class type = field.getType();
            //System.out.println(type.getName());
            System.out.println(type.getSimpleName());
            System.out.println(field.getName());
        }
         */
        StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(c.getModifiers()) + "class" + c.getSimpleName() + "{\n");
        for (Field field:fs){
            sb.append("\t");
            sb.append(Modifier.toString(field.getModifiers())+"");
            sb.append(field.getType().getSimpleName()+" ");
            sb.append(field.getName() + ";\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
