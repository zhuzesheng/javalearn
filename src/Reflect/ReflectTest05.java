package Reflect;

import java.lang.reflect.Field;

/**
 * java.lang.reflect.Field;获取某个特定的属性
 */

public class ReflectTest05 {
    public static void main(String[] args) throws Exception{
        //以前的方式
        User u = new User();
        u.age = 12;
        System.out.println(u.age);

        //获取类
        Class c = Class.forName("Reflect.User");

        //获取id属性
        Field idF = c.getDeclaredField("id");

        //获取到某个特定的属性可以用来？set，get
        Object o = c.newInstance();

        //打破封装
        idF.setAccessible(true);
        //给o对象的id属性赋值“110”
        idF.set(o,"110");

        //get
        System.out.println(idF.get(o));
    }
}
