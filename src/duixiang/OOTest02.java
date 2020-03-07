package duixiang;

public class OOTest02 {
    public static void main(String[] args) {
        //创建User对象
        //u是局部变量
        //u是一个引用
        //u保存内存地址指向堆内存的User对象
        User u = new User();

        //输出User对象内部实例变量
        System.out.println(u.no);
        System.out.println(u.name);
        System.out.println(u.addr);

        //修改User对象内部实例变量的值
        u.no = 110;
        u.name = "jack"; //jack是一个java对象，属于String对象
        u.addr = new Address();

        //在main方法当中目前只能看到一个引用“u”
        //一切都是只能通过u来访问
        System.out.println(u.name+"城市"+u.addr.city);
    }
}
