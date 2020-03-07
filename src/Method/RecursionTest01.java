package Method;

/**
 * 递归求5的阶乘
 */
public class RecursionTest01 {
    public static void main(String[] args) {
        int n = 5;
        int retValue = method(n);
        System.out.println(retValue);
    }
    public static int method(int a){
        if (a==1){
            return 1;
        }
        return a*method(a-1);
    }
}

/**
 * 非递归方式
 public class RecursionTest01 {
 public static void main(String[] args) {
 int n = 5;
 int retValue = method(n);
 System.out.println(retValue);
 }
 public static int method(int n){
    int result = 1;
    for(int i = n;i>0;i--){
        result *= i;
 }
 return result;
 }
 }
 */