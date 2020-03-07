package collection;
/**
 * Iterator iterator();获取集合所以依赖的迭代器对象
 * 通过迭代器中的方法完成集合的迭代（遍历）。
 * 注意：这种方式是所有集合通用的便利方式。
 */

import java.util.*;
public class CollectionTest02 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        //添加元素
        c.add(100);
        c.add(3.14);
        c.add(false);

        //迭代，遍历
        //1、获取迭代器对象
        //不需要关心底层集合的具体类型，所有集合依赖的迭代器都实现了java.util.Iterator;接口
        Iterator it = c.iterator(); //迭代器是面向接口编程
                                    //it是引用，保存了内存地址，指向堆中的“迭代器对象”
        //java.util.LinkedList$ListItr类是LinkedList集合所依赖的迭代器
        //java.util.AbstractList$Itr类是ArrayList集合所依赖的迭代器
        //System.out.println(it);
        //2、开始调用方法，完成遍历，迭代。
        //while循环
        while(it.hasNext()){
            Object element = it.next();
            System.out.println(element);
        }
        /*
            boolean b = it.hasNext(); 判断是否有更多的元素，如果有返回true
            Object o = it.next(); 将迭代器向下移动一位，并且取出指向的元素

            原则：调用it.next（）方法之前必须调用it.hasNext（）；
         */
        /*
            for循环
            for( Iterator it = c.iterator();it.hasNext();){
                Object o = it.next();
                System.out.println(o);
            }
         */
    }
}
