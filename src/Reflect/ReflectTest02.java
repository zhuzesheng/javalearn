package Reflect;

public class ReflectTest02 {
    public static void main(String[] args) throws Exception{
        //将A.class文件装载到JVM中的过程
        //Class.forName("A");

        //不会执行静态语句块
        //Class c = A.class;

        A a = new A();
        Class c = a.getClass();
    }
}
class A{
    static {
        System.out.println("A...");
    }
}