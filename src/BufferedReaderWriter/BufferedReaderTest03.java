package BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 就收用户键盘输入
 */
public class BufferedReaderTest03 {
    public static void main(String[] args) throws Exception{
        //使用BufferedReader来接收用户的输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //接收输入
        String str = br.readLine();
        System.out.println("您输入了："+str);

        br.close();
    }
}
