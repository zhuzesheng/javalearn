package Method;

public class MethodTest03 {
    public static void main(String[] args) {
        m();
    }
    public static void m(){
        for (int i = 0;i<10;i++){
            if(i == 5){
                //return;  //不是终止for循环，终止的是m()方法   qqq不会输出
                break;  // 终止的是for循环
            }
            System.out.println("i---"+i);
        }
        System.out.println("qqq");
    }
}
