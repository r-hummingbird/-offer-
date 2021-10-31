package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class sumNumbers {
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
    static int sum=0;
    public static int sumNumbers(TreeNode root) {
        dfs(root,0);
        return sum;
    }

    private static void dfs(TreeNode root, int val) {
        if (root==null)
            return;
        val=val*10+root.val;
        if (root.left==null&&root.right==null){
            sum+=val;
        }
        dfs(root.left,val);
        dfs(root.right,val);
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(1);
        TreeNode n2=new TreeNode(2);
        TreeNode n3=new TreeNode(3);
        n1.left=n2;
        n1.right=n3;
        System.out.println(sumNumbers(n1));
    }
}
