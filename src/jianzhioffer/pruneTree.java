package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class pruneTree {
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
    public static TreeNode pruneTree(TreeNode root) {
        if (root==null)
            return null;
        root.left=pruneTree(root.left);
        root.right=pruneTree(root.right);
        if (root.val==0&&root.left==null&&root.right==null)
            return null;
        return root;
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(1);
        TreeNode n2=new TreeNode(0);
        TreeNode n3=new TreeNode(0);
        TreeNode n4=new TreeNode(1);
        n1.right=n2;
        n2.left=n3;
        n2.right=n4;
        TreeNode res=pruneTree(n1);
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.offer(res);
        while (!queue.isEmpty()){
            int layer=queue.size();//层元素个数
            for (int i = 0; i <layer ; i++) {
                TreeNode node=queue.poll();
                System.out.print(node.val+" ");
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
            }
        }
    }

}
