package 可变长参数;

import java.util.Date;

/**
 *关于java中的可变长参数
 */
public class Test01 {
    public static void main(String[] args) throws Exception{
        m1();
        m1(1);
        m1(1,2);
        m1(2,3,4,5);
        m2("a","v","a","q");
        m3(Date.class);
    }
    //m1方法有一个int类型可变长参数
    public static void m1(int... a){//m1方法在调用的时候，传递的实参可以是0-N个。
        System.out.println("Test");
    }
    //如果可以精确匹配的方法，则调用该方法，不会去执行可变长参数的那个方法
    public static void m1(int i){
        System.out.println(i);
    }

    //可变长参数可以等同看做数组
    public static void m2(String... args){
        for (int i = 0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    public static void m3(Class... args) throws Exception{
        for (int i = 0;i<args.length;i++){
            Class c = args[i];
            System.out.println(c.newInstance());
        }
    }
    //可变长参数只能出现一次，并且只能出现所有参数的最后一位
    public static void m4(int i,String... a){

    }
}
