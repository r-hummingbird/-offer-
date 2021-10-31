package jianzhioffer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class minimumLengthEncoding {
    static TreeNode root;

    static class TreeNode{
        TreeNode[] next;
        boolean sLeaf;

        public TreeNode(){
            next = new TreeNode[26];
        }
    }

    public static int minimumLengthEncoding(String[] words) {
        root=new TreeNode();
        Arrays.sort(words,(s1,s2)->(s2.length()-s1.length()));
        int res=0;
        for (String word:words){
            res+=getEncode(word);
        }
        return res;
    }

    private static int getEncode(String word) {
        int n=word.length();
        TreeNode t=root;
        boolean isNotIn=false;
        for (int i = n-1; i >=0 ; i--) {
            int x=word.charAt(i)-'a';
            if (t.next[x]==null){
                t.next[x]=new TreeNode();
                isNotIn=true;
            }
            t=t.next[x];
        }
        return isNotIn?n+1:0;
    }

    public static void main(String[] args) {
        String[] words={"time", "me", "bell"};
        System.out.println(minimumLengthEncoding(words));
    }
}
