package Method;

/**
 * 1、什么条件满足之后构成了方法重载？
 *  --在同一个类当中
 *  --方法名相同
 *  --参数列表不同
 *      数量不同
 *      顺序不同
 *      类型不同
 * 2、方法重载和什么有关系？和什么没关系？
 *  --方法重载和方法名+参数列表有关系
 *  --方法重载和返回值类型无关
 *  --方法重载和修饰符列表无关
 */
public class OverloadTest01 {
    public static void main(String[] args) {

    }
    public static void m1(){}
    public static void m1(int a){}

    public static void m2(int a,double b){}
    public static void m2(double a,int b){}

    public static void m3(int a){}
    public static void m3(double b){}
    /**
    public static void m4(){}
    public static int m4(){
        return 1;
    }
     */
}
