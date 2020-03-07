package ObjectInputOutStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 反序列化
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        //1、创建反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\www.txt"));

        //2、反序列化
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
