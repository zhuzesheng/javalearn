package ObjectInputOutStream;

import java.io.Serializable;//该接口是一个“可序列化的”
                            //该接口没有任何方法，是一个标识接口
                            //像这样的接口还有：java.lang.Cloneable;可克隆的

/**
 * 标识接口的作用：起到标识的作用
 * JVM如果看到该对象实现了某个标志接口，会对他特殊待遇
 */
public class User implements Serializable {
    String name;
    User(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
