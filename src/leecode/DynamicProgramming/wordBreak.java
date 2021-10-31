package leecode.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class wordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean[] exit=new boolean[n+1];
        exit[0]=true;
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 0; j <i ; j++) {
                if (exit[j]&&wordDict.contains(s.substring(j,i))){
                    exit[i]=true;
                    break;
                }
            }
        }
        return exit[n];
    }

    public static void main(String[] args) {
        String s="leecode";
        List<String> wordDict=new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(wordBreak(s,wordDict));
    }
}
