package jianzhioffer;

public class Trie {
    /** Initialize your data structure here. */
    static TreeNode root;
    static class TreeNode{
        TreeNode[] next;
        boolean isEnd;
        public TreeNode(){
            next=new TreeNode[26];
        }
    }
    public Trie() {
        root=new TreeNode();
    }

    /** Inserts a word into the trie. */
    public static void insert(String word) {
        TreeNode cur=root;
        for (char ch:word.toCharArray()){
            if (cur.next[ch-'a']==null){
                cur.next[ch-'a']=new TreeNode();
            }
            cur=cur.next[ch-'a'];
        }
        cur.isEnd=true;
    }

    /** Returns if the word is in the trie. */
    public static boolean search(String word) {
        TreeNode cur=root;
        for (char ch:word.toCharArray()){
            if (cur.next[ch-'a']==null){
                return false;
            }
            cur=cur.next[ch-'a'];
        }
        return cur.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public static boolean startsWith(String prefix) {
        TreeNode cur=root;
        for (char ch:prefix.toCharArray()){
            if (cur.next[ch-'a']==null){
                return false;
            }
            cur=cur.next[ch-'a'];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie obj = new Trie();
        obj.insert("apple");
        boolean param_2 = obj.search("apple");
        boolean param_3 = obj.startsWith("app");
        System.out.println(param_2+" "+param_3);
    }
}
