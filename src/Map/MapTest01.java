package Map;

import java.util.*;

/**
 * Map集合中常用的方法
 * void clear();清空Map
 * boolean containsKey(Object key); 判断Map中是否包含这样的key
 * boolean containsValue(Object value);判断Map中是否包含这样的value
 *
 * Set<Map.Entry<K,V>> entrySet()返回此映射中包含的映射关系的Set试图、
 *
 * Object get(Object key);通过key获取value
 * Object get(Object key，Object value);向集合中添加键值对
 *
 * boolean isEmpty();判断集合是否为空
 * Object remove(Object key);通过key将键值对删除
 * int size();获取Map中键值对的个数
 *
 * Set keySet();获取Map中所有的key
 * Collection values;获取Map集合中所有的value
 *
 * 注意：存储在Map集合key部分的元素需要同时重写hashCode+equals方法
 */
public class MapTest01 {
    public static void main(String[] args) {
        //1、创建Map集合
        Map persons = new HashMap();//HashMap的默认初始化容量是16，默认加载因子是0.75

        //2、存储键值对
        persons.put("10000","JACK");
        persons.put("10011","JACK");
        persons.put("10002","SUN");
        persons.put("10003","TOM");
        persons.put("10004","KING");

        //3、判断键值对的个数 Map中的key是无序不可重复的，和HashMap相同
        System.out.println(persons.size());

        //4、判断集合中是否包含这样的key
        System.out.println(persons.containsKey("10000"));

        //5、判断集合中是否包含这样的value
        //map中如果key重复了，value采用覆盖
        System.out.println(persons.containsValue("KING"));

        //6、通过key获取value
        String k = "10011";
        Object v = persons.get(k);
        System.out.println(v);

        //7、通过key删除键值对
        persons.remove("10002");
        System.out.println(persons.size());

        //8、获取所有的values
        Collection values = persons.values();
        Iterator it = values.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //9、获取所有的key
        Set keys = persons.keySet();

        Iterator it2 = keys.iterator();
        while (it2.hasNext()){
            Object id = it2.next();
            Object name = persons.get(id);
            System.out.println(id+"---"+name);
        }

        //10、entrySet 将map转换成set集合
        Set entrySet = persons.entrySet();
        Iterator it3 = entrySet.iterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
        }

    }
}
