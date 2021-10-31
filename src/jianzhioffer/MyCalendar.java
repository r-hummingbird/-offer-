package jianzhioffer;

import java.util.Map;
import java.util.TreeMap;

public class MyCalendar {
    static TreeMap<Integer,Integer> calendar=new TreeMap<>();
    public MyCalendar() {

    }

    public static boolean book(int start, int end) {
        Map.Entry<Integer,Integer> floor=calendar.floorEntry(start);
        Map.Entry<Integer,Integer> ceiling=calendar.ceilingEntry(start);
        if ((floor==null||floor.getValue()<=start)&&(ceiling==null||ceiling.getKey()>=end)){
            calendar.put(start,end);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyCalendar obj = new MyCalendar();
        boolean param_1 = obj.book(10,20);
        boolean param_2 = obj.book(15,25);
        boolean param_3 = obj.book(20,30);
        System.out.println(param_1+" "+param_2+" "+param_3);
    }
}
