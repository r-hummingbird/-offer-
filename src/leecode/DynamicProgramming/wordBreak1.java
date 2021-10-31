package leecode.DynamicProgramming;

import java.util.*;

public class wordBreak1 {


    public static List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res=new ArrayList<>();
        Set<String> set=new HashSet<>(wordDict);
        backTrack(s,res,0,new LinkedList<>(),set);
        return res;
    }

    private static void backTrack(String s, List<String> res, int idx, Deque<String> path, Set<String> set) {
        if (idx==s.length()){
            res.add(String.join(" ",path));
            return;
        }
        for (int i = idx; i <s.length() ; i++) {
            String str=s.substring(idx,i+1);
            if (set.contains(str)){
                path.add(str);
                backTrack(s,res,i+1,path,set);
                path.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        String s="catsanddog";
        List<String> wordDict=new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        System.out.println(wordBreak(s,wordDict));
    }
}
