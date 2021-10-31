package jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findMinDifference {
    public static int findMinDifference(List<String> timePoints) {
        if (timePoints.size()>24*60){
            return 0;
        }
        List<Integer> mins=new ArrayList<>();
        for (String t : timePoints){
            String[] time=t.split(":");
            mins.add(Integer.parseInt(time[0])*60+Integer.parseInt(time[1]));
        }
        Collections.sort(mins);
        mins.add(mins.get(0)+24*60);
        int res=24*60;
        for (int i = 1; i <mins.size() ; ++i) {
            res=Math.min(res,mins.get(i)-mins.get(i-1));
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> timePoints=new ArrayList<>();
        timePoints.add("23:59");
        timePoints.add("00:00");
        System.out.println(findMinDifference(timePoints));
    }
}
