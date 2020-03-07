package Hash;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

/**
 * 关于往set集合中存储的元素，该元素的hashCode和equals方法
 * HashMap中有一个put方法，put（key,value）key是无序不可重复的
 * 结伦：存储在HashSet集合或者HashMap集合Key部分的元素，需要同时重写hashCode+equals
 */
public class SetTest02 {
    public static void main(String[] args) {
        //创建集合
        Set es = new HashSet();

        Employee e1 = new Employee("1000","JACK");
        Employee e2 = new Employee("1001","SAM");
        Employee e3 = new Employee("2000","KING");
        Employee e4 = new Employee("2001","JIM");
        Employee e5 = new Employee("3000","TOM");

        es.add(e1);
        es.add(e2);
        es.add(e3);
        es.add(e4);
        es.add(e5);

        System.out.println(es.size());

    }
}

//根据现实的业务逻辑得知：该公司员工编号是：1000-9999
class Employee{
    String no;
    String name;
    Employee(String no,String name){
        this.no = no;
        this.name = name;
    }
    //重写equals方法

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(no, employee.no) &&
                Objects.equals(name, employee.name);
    }

    //重写hashCode方法
    public int hashCode(){
        //以员工编号分组
        return no.hashCode();
    }
}