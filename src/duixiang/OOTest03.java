package duixiang;

public class OOTest03 {
    public static void main(String[] args) {
        User u = new User();

        //OOTest02中是这么写的
        //u.addr = new Address();

        //a是引用
        //a是局部变量
        Address a = new Address();
        u.addr = a;
        System.out.println(u.addr.city);//null

        a.city = "天津";
        System.out.println(u.addr.city);
    }
}
