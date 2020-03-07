package Hash;
/**
 * java.util.Set;
 *  java.util.SortedSet;  无序不可重复，但是存进去的元素可以按照元素大小顺序自动排列
 *      java.util.TreeSet;
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest01 {

    public static void main(String[] args) throws ParseException {

        SortedSet ss = new TreeSet();

        ss.add(20);
        ss.add(32);
        ss.add(13);
        ss.add(5);

        //遍历
        Iterator it = ss.iterator();
        while (it.hasNext()){
            Object element = it.next();
            System.out.println(element);
        }

        //String
        SortedSet strs = new TreeSet();

        strs.add("JACK");
        strs.add("JIM");
        strs.add("TOM");
        strs.add("KING");
        strs.add("SAM");

        //遍历
        it = strs.iterator();
        while (it.hasNext()){
            Object element = it.next();
            System.out.println(element);
        }

        //日期Date
        String st1 = "2017-01-31";
        String st2 = "2015-04-26";
        String st3 = "2016-03-15";
        String st4 = "2020-01-06";
        String st5 = "2013-01-31";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        Date t1 = sdf.parse(st1);
        Date t2 = sdf.parse(st2);
        Date t3 = sdf.parse(st3);
        Date t4 = sdf.parse(st4);
        Date t5 = sdf.parse(st5);

        SortedSet times = new TreeSet();
        times.add(t1);
        times.add(t2);
        times.add(t3);
        times.add(t4);
        times.add(t5);

        it = times.iterator();
        while (it.hasNext()){
            Object element = it.next();
            if (element instanceof Date){
                Date d = (Date)element;
                System.out.println(sdf.format(d));
            }

        }
        }
    }

