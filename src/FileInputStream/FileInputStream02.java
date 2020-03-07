package FileInputStream;
//以下程序存在缺点，频繁访问磁盘，伤害磁盘，并且效率低。
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream02 {
    public static void main(String[] args) {
        FileInputStream fis = null;


        try {
            //1、创建流
            fis = new FileInputStream("F:\\aaa.txt");

            //2、开始读
            /*while (true){
                int temp = fis.read();
                if (temp==-1) break;
                System.out.println(temp);
            }*/

            //升级循环
            int temp = 0;
            while((temp=fis.read())!=-1){
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
