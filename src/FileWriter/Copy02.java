package FileWriter;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 文件复制
 */
public class Copy02 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("F:\\aaa.txt");
        FileWriter fw = new FileWriter("F:\\bbb.txt");

        char[] chars = new char[512];
        int temp = 0;
        while((temp = fr.read(chars))!= -1){
            fw.write(chars,0,temp);
        }
        fw.flush();
        fr.close();
        fw.close();
    }
}
