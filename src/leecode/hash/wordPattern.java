package leecode.hash;

import java.util.HashMap;

public class wordPattern {
    public static boolean wordPattern(String pattern, String s) {
        if(pattern == null || s==null) return false;
        String[] string = s.split(" ");
        if(pattern.length() != string.length) return false;
        HashMap<Character,String> map = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char tmp = pattern.charAt(i);
            //key已经在
            if(map.containsKey(tmp)){
                //不对应就失败
                if(!map.get(tmp).equals(string[i])) return false;
            }
            //key不存在
            else{
                //两个value的值一样 a-dog b-dog->false
                if (map.containsValue(string[i])) return false;
                else
                    //添加k-v值
                    map.put(tmp,string[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern="abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern,str));
    }
}
