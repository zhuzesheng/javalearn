package HotelExample;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("欢迎使用酒店管理系统");

        //初始化酒店
        Hotel h = new Hotel();

        //输出房间列表
        h.print();
        while (true){

            System.out.println("请输入预订房间的编号：");

            String no = s.next();

            //预订房间
            h.order(no);

            //打印酒店列表
            h.print();
        }

    }
}
