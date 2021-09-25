package leecode.hash;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longestWord {
    public static String longestWord(String[] words) {
        Arrays.sort(words);
        String res="";
        Set<String> set=new HashSet<>();
        set.add(res);
        for (String word:words){
            if (set.contains(word.substring(0,word.length()-1))){
                set.add(word);
                if (word.length()>res.length()){
                    res=word;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words=new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String res=longestWord(words);
        System.out.println(res);
    }
}
