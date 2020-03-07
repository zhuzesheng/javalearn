package BufferedReaderWriter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/**
 * BufferedWriter
 */
public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception{
        //创建带有缓冲区的的字符输出流
        //BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\ccc.txt"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\ccc.txt",true)));

        bw.write("哈哈哈");
        bw.newLine();
        bw.write("呜呜呜呜");
        bw.flush();
        bw.close();
    }
}
