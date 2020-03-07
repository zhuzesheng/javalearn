package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean remove(Object o);
 * remove和contains方法都需要集合中的元素重写equals方法。
 * 因为Object中的equals方法比较内存地址，在现实的业务逻辑当中不能比较内存地址，该比较内容。
 */

public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c  = new ArrayList();
        Integer i1 = new Integer(10);
        c.add(i1);

        Integer i2 = new Integer(10);
        c.remove(i2);
        System.out.println(c.size());//0

        Manager m1 = new Manager(100,"SIMTH");
        c.add(m1);
        Manager m2 = new Manager(100,"SMITH");
        c.remove(m2);
        System.out.println(c.size());//0
    }
}
