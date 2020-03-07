package BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用BufferedReader和BufferedWriter完成复制
 */
public class Copy03 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("F:\\ccc.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\aaa.txt"));

        String temp = null;
        while((temp=br.readLine())!=null){
            bw.write(temp);
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
