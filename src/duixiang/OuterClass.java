package duixiang;

public class OuterClass {
    //方法
    public void m1(){
        //局部变量
        int i =10;
        //局部内部类
        //局部内部类不能用访问控制权限修饰符修饰。
        class InnerClass{
            //内部类不能有静态生命
            //public static void m1(){}
            //成员方法
            public void m1(){
                System.out.println(i);
            }
        }
    }

}
