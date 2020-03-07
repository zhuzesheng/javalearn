package ObjectInputOutStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *  java.io.ObjectOutPutStream; 序列化JAV对象到硬盘（Serial）
 *  java.io.ObjectInputStream;将硬盘中的数据“反序列化”到JVM内存（DeSerial）
 *
 *  Compile 编译（java--->class）
 *  DeCompile 反编译（class--->class）
 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws  Exception{
        //1、创建JAV对象
        User u1 = new User("JACK");

        //2、创建输出流（序列化流）（JVM中的JAVA对象状态保存到硬盘中）
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\www.txt"));

        //3、写
        oos.writeObject(u1);

        oos.flush();
        oos.close();
    }
}
