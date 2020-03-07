package collection;



import java.util.*;
import java.util.Collection;

/**
 * boolean add(Object element);向集合中添加元素
 * int size();获取集合中元素的个数
 * void clear();清空集合
 * boolean isEmpty();判断集合中是否有元素
 * Object[] toArray();将集合转换成数组
 */
public class CollectionTest {
    public static void main(String[] args) {
        //1、创建集合
        Collection c = new ArrayList();
        //2、添加元素
        c.add(1);
        c.add(new Integer(100));

        Object o = new Object();
        c.add(o);//Collection中只能单个存储元素，并且只能存储引用类型

        Customer cus = new Customer("JACK",20);
        c.add(cus);
        //3、获取元素的个数
        System.out.println(c.size());//4
        System.out.println(c.isEmpty());//false

        //4、将集合转换成Object类型的数组
        Object[] objs = c.toArray();

        for(int i =0;i<objs.length;i++){
            System.out.println(objs);
        }
        //5、清空
        c.clear();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
    }
}
class Customer{
    String name;
    int age;
    Customer(String name,int age){
        this.name = name;
        this.age = age;
    }
    //重写Object中的toString
    public String toString(){
        return "Customer[name="+name+",age"+age+"]";
    }
}