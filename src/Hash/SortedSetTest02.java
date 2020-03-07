package Hash;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * SortedSet集合 存储元素为什么可以自动排序？
 * 因为被存储的元素实现了Comparable接口
 * SUN编写TreeSet集合在添加元素的时候，会调用compareTo方法完成比较
 */
public class SortedSetTest02 {
    public static void main(String[] args) {
        SortedSet users = new TreeSet();

        User u1 = new User(18);
        User u2 = new User(16);
        User u3 = new User(23);
        User u4 = new User(25);
        User u5 = new User(20);

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        Iterator it = users.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

class User implements Comparable{
    int age;
    User(int age){
        this.age = age;
    }

    public String toString(){
        return "User[age="+age+"]";

    }
    //实现java.lang.Comparable;接口中的compareTo方法
    //该方法程序员负责实现，SUN提供的程序已经调用了该方法

    @Override
    public int compareTo(Object o) {
        int age1= this.age;
        int age2 = ((User)o).age;
        return age2-age1;
    }
}

