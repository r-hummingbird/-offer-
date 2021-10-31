package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class increasingBST {
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
    static TreeNode head=new TreeNode();
    static TreeNode pre =head;
    public static TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return head.right;
    }

    private static void inorder(TreeNode root) {
        if (root==null)
            return;
        inorder(root.left);
        pre.right=root;
        pre=root;
        root.left=null;
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(5);
        TreeNode n2=new TreeNode(3);
        TreeNode n3=new TreeNode(6);
        TreeNode n4=new TreeNode(2);
        TreeNode n5=new TreeNode(4);
        TreeNode n6=new TreeNode(8);
        TreeNode n7=new TreeNode(1);
        TreeNode n8=new TreeNode(7);
        TreeNode n9=new TreeNode(9);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.right=n6;
        n4.left=n7;
        n5.left=n8;
        n5.right=n9;
        TreeNode res=increasingBST(n1);
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
