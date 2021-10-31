package jianzhioffer;

public class MapSum {
    class TrieNode {
        int val;
        TrieNode[] child;

        TrieNode() {
            this.child = new TrieNode[26];
        }
    }

    TrieNode root;
    int sum = 0;

    /** Initialize your data structure here. */
    public MapSum() {
        root = new TrieNode();
    }

    public void insert(String key, int val) {
        TrieNode root = this.root;
        char[] data = key.toCharArray();
        for (int i = 0; i < data.length; i++) {
            int idx = data[i] - 'a';
            if (root.child[idx] == null) {
                root.child[idx] = new TrieNode();
            }
            root = root.child[idx];
        }
        root.val = val;
    }

    public int sum(String prefix) {
        this.sum = 0;
        TrieNode root = this.root;
        char[] preData = prefix.toCharArray();
        for (int i = 0; i < preData.length; i++) {
            int idx = preData[i] - 'a';
            if (root.child[idx] == null) {
                return sum;
            }
            root = root.child[idx];
        }
        traverse(root);
        return sum;
    }

    private void traverse(TrieNode root) {
        if (root == null) {
            return ;
        }
        if (root.val != 0) {
            sum += root.val;
        }
        for (int i = 0; i < root.child.length; i++) {
            traverse(root.child[i]);
        }
    }


    public static void main(String[] args) {
        MapSum obj = new MapSum();
        obj.insert("apple",3);
        int param_2 = obj.sum("ap");
        System.out.println(param_2);

    }
}
