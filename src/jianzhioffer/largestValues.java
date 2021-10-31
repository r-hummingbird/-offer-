package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class largestValues {
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
    static List<Integer> list=new ArrayList<>();
    static LinkedList<TreeNode> queue=new LinkedList<>();
    public static List<Integer> largestValues(TreeNode root) {
        if (root==null)
            return list;
        queue.offer(root);
        while (!queue.isEmpty()){
            int len=queue.size();
            int max=Integer.MIN_VALUE;
            for (int i = 0; i <len ; i++) {
                TreeNode node = queue.poll();
                max=Math.max(max,node.val);
                if (node.left!=null)queue.offer(node.left);
                if (node.right!=null)queue.offer(node.right);
            }
            list.add(max);
        }
        return list;

    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(1);
        TreeNode n2=new TreeNode(3);
        TreeNode n3=new TreeNode(2);
        TreeNode n4=new TreeNode(5);
        TreeNode n5=new TreeNode(3);
        TreeNode n6=new TreeNode(9);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.right=n6;
        System.out.println(largestValues(n1));
    }
}
