package Map;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

import java.util.TreeMap;

/**
 *SortedMap中的key特点：无序不可重复，但是存进去的元素可以按照大小自动排列。
 * 如果想自动排序：key部分的元素需要，1、实现Comparable接口，2、单独写一个比较器
 */
public class MapTest03 {
    public static void main(String[] args) {
        //Map，key存储product，value存储重量
        SortedMap products = new TreeMap();

        //准备对象
        Product p1 = new Product("西瓜",1.0);
        Product p2 = new Product("苹果",4.0);
        Product p3 = new Product("桃子",5.0);
        Product p4 = new Product("香蕉",2.5);

        //添加
        products.put(p1,8.0);
        products.put(p2,3.0);
        products.put(p3,4.0);
        products.put(p4,6.0);
        //遍历
        Set keys = products.keySet();
        Iterator it = keys.iterator();
        while (it.hasNext()){
            Object k = it.next();
            Object v = products.get(k);
            System.out.println(k+"---"+v+"kg");
        }
    }
}
class Product implements Comparable{
    String name;
    double price;
    Product(String name,double price){
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        double price1 = this.price;
        double price2 = ((Product)o).price;
        if (price1<price2){
            return -1;
        }else if (price1>price2){
            return 1;
        }else {
            return 0;
        }
    }
}