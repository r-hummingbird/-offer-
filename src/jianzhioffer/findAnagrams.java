package jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int l=0,r=0;
        int m=s.length(),n=p.length();
        if (n>m) return list;
        int[] n1=new int[26];
        int[] n2=new int[26];
        for(int i = 0; i < n; i++) {
            n1[s.charAt(i)-'a']++;
            n2[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(n1, n2)) list.add(0);
        for(int i = n; i < m; i++) {
            n1[s.charAt(i)-'a']++;
            n1[s.charAt(i-n)-'a']--;
            if(Arrays.equals(n1, n2)) list.add(i-n+1);
        }
        return list;
    }


    public static void main(String[] args) {
        String s="abab";
        String p="ab";
        List<Integer> res=findAnagrams(s,p);
        System.out.println(res);
    }
}
