package jianzhioffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class permutation {
    public static String[] permutation(String s) {
        char[] ch=s.toCharArray();
        Set<String> set=new HashSet<>();
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[ch.length];
        dfs(ch,"",visited,set);
        return set.toArray(new String[0]);
    }

    private static void dfs(char[] ch, String s, boolean[] visited, Set<String> set) {
        if (s.length()==ch.length){
            set.add(s);
            return;
        }
        for (int i = 0; i <ch.length ; i++) {
            if (visited[i])continue;
            visited[i]=true;
            dfs(ch,s+String.valueOf(ch[i]),visited,set);
            visited[i]=false;
        }
    }


    public static void main(String[] args) {
        String s="abc";
        String[] res=permutation(s);
        for (String str:res){
            System.out.print(str+" ");

        }
    }
}
