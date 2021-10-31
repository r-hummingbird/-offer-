package jianzhioffer;

public class isAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.equals(t))
            return false;
        int[] s1=new int[26];
        int[] t1=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            s1[s.charAt(i)-'a']++;
        }
        for (int i = 0; i <t.length() ; i++) {
            t1[t.charAt(i)-'a']++;
        }
        for (int i = 0; i <26 ; i++) {
            if (s1[i]!=t1[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
}
