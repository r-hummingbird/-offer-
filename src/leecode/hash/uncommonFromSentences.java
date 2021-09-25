package leecode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class uncommonFromSentences {
    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] A=(s1+" "+s2).split(" ");

        HashMap<String,Integer> temp1=new HashMap<>();

        for (int i = 0; i <A.length ; i++) {
            temp1.put(A[i],temp1.getOrDefault(A[i],0)+1);
        }
        List<String> list=new ArrayList<>();
        for (String key:temp1.keySet()){
            if (temp1.get(key)==1){
                list.add(key);
            }
        }
        String[] res  = new String[list.size()];
        return list.toArray(res);
    }

    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        String[] res=uncommonFromSentences(A,B);
        for (String result:res){
            System.out.print(result+" ");
        }
    }
}
