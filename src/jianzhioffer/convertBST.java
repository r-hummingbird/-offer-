package jianzhioffer;

import java.util.LinkedList;

public class convertBST {
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
    public static TreeNode convertBST(TreeNode root) {
        if (root==null)
            return root;
        convertBST(root.right);
        root.val+=sum;
        sum=root.val;
        convertBST(root.left);
        return root;
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(3);
        TreeNode n2=new TreeNode(2);
        TreeNode n3=new TreeNode(4);
        TreeNode n4=new TreeNode(1);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        TreeNode res=convertBST(n1);
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.offer(res);
        while (!queue.isEmpty()){
            int layer=queue.size();
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
