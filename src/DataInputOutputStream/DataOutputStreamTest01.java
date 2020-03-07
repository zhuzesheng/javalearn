package DataInputOutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * java.io.DataOutputStream;数据字节输出流
 * 可以将内存中的“int i = 0；”写入到硬盘文件中，写进去的不是字符串，写进去的是二进制数据，带类型。
 */
public class DataOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        //创建数据字节输出流
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("F:\\qqq.txt"));

        //准备数据
        byte b = 10;
        short s = 11;
        int  i = 12;
        long l = 1000L;
        float f = 3.2f;
        double d = 2.3;
        boolean flag = false;
        char c = 'a';
        //写
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(flag);
        dos.writeChar(c);
        //刷新
        dos.flush();
        //关闭
        dos.close();

    }
}
