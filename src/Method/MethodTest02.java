package Method;

public class MethodTest02 {
    public static void main(String[] args) {
        MethodTest02.sum(10,20);
        System.out.println("aaa");
    }
    public static void sum(int i,int j){
        System.out.println(i+"+"+j+"="+(i+j));
        MethodTest02.doSome();
    }
    public static void doSome(){
        System.out.println("dosome");
    }

}
