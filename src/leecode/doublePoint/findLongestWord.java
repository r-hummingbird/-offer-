package leecode.doublePoint;

import java.util.ArrayList;
import java.util.List;

public class findLongestWord {
    public static String findLongestWord(String s, List<String> dictionary) {
        dictionary.sort((o1,o2)->o1.length()==o2.length()?o1.compareTo(o2):o2.length()-o1.length());
        for (String word:dictionary){
            if (equals(s,word)){
                return word;
            }
        }
        return "";
    }

    private static boolean equals(String s, String word) {
        char[] ch=s.toCharArray();
        char[] ch1=word.toCharArray();
        if (ch1.length>ch.length){
            return false;
        }
        int idx1=0,idx2=0;
        while (idx1<ch.length&&idx2<ch1.length){
            while (idx1<ch.length&&ch[idx1]!=ch1[idx2]){
                idx1++;
            }
            if (idx1>=ch.length){
                break;
            }
            idx1++;
            idx2++;
            if ((ch.length-idx1)<(ch1.length-idx2)){
                return false;
            }
        }
        return idx2==ch1.length;
    }

    public static void main(String[] args) {
        String s="abpcplea";
        List<String> dictionary=new ArrayList<String>();
        dictionary.add("ale");
        dictionary.add("apple");
        dictionary.add("monkey");
        dictionary.add("plea");
        System.out.println(findLongestWord(s,dictionary));
    }
}
