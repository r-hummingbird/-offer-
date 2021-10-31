package jianzhioffer;

import java.util.ArrayList;

public class findTarget {
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
    static ArrayList<Integer> list=new ArrayList<>();
    public static boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int r=list.size()-1;
        int l=0;
        while (l<r){
            int val=list.get(l)+list.get(r);
            if (val==k){
                return true;
            }else if (val<k){
                l++;
            }else {
                r--;
            }
        }
        return false;
    }

    private static void inorder(TreeNode root) {
        if (root==null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(8);
        TreeNode n2=new TreeNode(6);
        TreeNode n3=new TreeNode(10);
        TreeNode n4=new TreeNode(5);
        TreeNode n5=new TreeNode(7);
        TreeNode n6=new TreeNode(9);
        TreeNode n7=new TreeNode(11);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.left=n6;
        n3.right=n7;
        int k=12;
        System.out.println(findTarget(n1,k));
    }


}
