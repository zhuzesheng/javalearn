package foreach;

import java.util.HashSet;
import java.util.Set;

public class ForeachTest01 {
    public static void main(String[] args) {
        int[]  a = {1,2,3,4,5,6};
        //遍历
        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //foreach
        for(int e:a){ //int e代表的是集合或者数组中的每一个元素
            System.out.println(e);
        }

        //集合
        Set<String> strs = new HashSet<String>();

        strs.add("张三");
        strs.add("李四");
        strs.add("王五");
        strs.add("小明");

        //遍历
        for (String name:strs){
            System.out.println(name);
        }

    }
}
