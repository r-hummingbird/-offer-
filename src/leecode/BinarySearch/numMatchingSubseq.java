package leecode.BinarySearch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class numMatchingSubseq {
    public static int numMatchingSubseq(String s, String[] words) {
        List<Integer>[] list=new List[26];
        for(int i = 0;i<26;i++)
            list[i] = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            list[s.charAt(i)-'a'].add(i);
        }
        int res=0;
        for (String word:words){
            int idx=0;
            boolean flag=true;
            for (char c:word.toCharArray()){
                idx=get(list[c-'a'],idx);
                if(idx==-1){
                    flag = false;
                    break;
                }
                idx++;
            }
            if(flag) res++;
        }
        return res;

    }

    public static int get(List<Integer> list,int idx){
        if(list.isEmpty()) return -1;
        int l = 0,r = list.size()-1;
        while(l<=r){
            int mid = l+r>>1;
            if(list.get(mid)<idx){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        if(l==list.size()) return -1;
        return list.get(l);
    }
    public static void main(String[] args) {
        String s="abcde";
        String[] words=new String[]{"a", "bb", "acd", "ace"};
        System.out.println(numMatchingSubseq(s,words));
    }
}
