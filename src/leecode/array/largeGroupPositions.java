package leecode.array;

import java.util.ArrayList;
import java.util.List;

public class largeGroupPositions {
    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result=new ArrayList<>();
        s=s+"A";
        int start=0;
        for (int i = 1; i <s.length() ; i++) {
            if (s.charAt(i)!=s.charAt(i-1)){
                if (i-start>=3){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(start);
                    temp.add(i - 1);
                    result.add(temp);
                }
                start=i;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String s="abcdddeeeeaabbbcd";
        List<List<Integer>> result=largeGroupPositions(s);
        System.out.println(result);
    }
}
