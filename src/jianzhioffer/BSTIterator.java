package jianzhioffer;

import java.util.ArrayList;

public class BSTIterator {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static ArrayList<TreeNode> list;
    static int hasNext=0;
    public BSTIterator(TreeNode root) {
         list=new ArrayList<>();
         inorder(root);
    }

    private void inorder(TreeNode node) {
        if(node == null) return;
        inorder(node.left);
        list.add(node);
        inorder(node.right);
    }

    public static int next() {
        return list.get(hasNext++).val;
    }

    public static boolean hasNext() {
        return hasNext<list.size();
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(7);
        TreeNode n2=new TreeNode(3);
        TreeNode n3=new TreeNode(15);
        TreeNode n4=new TreeNode(9);
        TreeNode n5=new TreeNode(20);
        n1.left=n2;
        n1.right=n3;
        n3.left=n4;
        n3.right=n5;
        BSTIterator obj = new BSTIterator(n1);
        int param_1 = obj.next();
        System.out.println(param_1);
        boolean param_2 = obj.hasNext();
        System.out.println(param_2);
    }
}
