package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

public class MovingAverage {
    static int size;
    static List<Integer> list;
    public MovingAverage(int size) {
        list=new ArrayList<>();
        this.size=size;
    }

    public static double next(int val) {
        list.add(val);
        double res=0;
        if (list.size()<size){
            for (int i = 0; i <list.size() ; i++) {
               res+=((double)list.get(i))/((double)list.size());
            }
        }else {
            for (int i = list.size()-1; i >=list.size()-size ; i--) {
                res+=((double)list.get(i))/((double)size);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        MovingAverage obj = new MovingAverage(3);
        double param_1 = obj.next(1);
        System.out.println(param_1);
        double param_2 = obj.next(10);
        System.out.println(param_2);
        double param_3 = obj.next(3);
        System.out.println(param_3);
        double param_4 = obj.next(5);
        System.out.println(param_4);
    }
}
