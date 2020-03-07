package Decorator_装饰者;

import java.io.FileReader;
import java.io.IOException;

public class BufferedReader { //BufferedReader装饰者
    //关联关系
    FileReader reader;//
    //Constructor
    BufferedReader(FileReader reader){
        this.reader = reader;
    }
    //对FileReader中的close方法进行扩展
    public void close() throws IOException {
        //扩展
        System.out.println("扩展代码1");
        reader.close();
        System.out.println("扩展代码2");
    }


}
