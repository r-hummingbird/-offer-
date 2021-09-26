package leecode.hash;

import java.util.*;

public class topKFrequent {
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> count = new HashMap<>();
        int n = words.length;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(count.containsKey(words[i])){
                count.put(words[i],count.get(words[i])+1);
            }else{
                count.put(words[i], 1);
                list.add(words[i]);
            }
        }
        Collections.sort(list,new Comparator<String>(){
            public int compare(String s1,String s2){
                int c1 = count.get(s1);
                int c2 = count.get(s2);
                if(c1 != c2) return c2 - c1;
                else{
                    return s1.compareTo(s2);
                }
            }
        });
        return list.subList(0, k);
    }

    public static void main(String[] args) {
        String[] words=new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k=2;
        System.out.println(topKFrequent(words,k));
    }
}
