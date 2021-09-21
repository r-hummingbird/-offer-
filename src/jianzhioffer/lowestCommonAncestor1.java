package jianzhioffer;

public class lowestCommonAncestor1 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            // p q 一个在左，一个在右
            return root;
        }
        if (left != null) {
            // p q 都在左子树
            return left;
        }
        if (right != null) {
            // p q 都在右子树
            return right;
        }
        return null;
    }
    public static void main(String[] args) {
        TreeNode n1=new TreeNode(3);
        TreeNode n2=new TreeNode(5);
        TreeNode n3=new TreeNode(1);
        TreeNode n4=new TreeNode(6);
        TreeNode n5=new TreeNode(2);
        TreeNode n6=new TreeNode(0);
        TreeNode n7=new TreeNode(8);
        TreeNode n8=new TreeNode(7);
        TreeNode n9=new TreeNode(4);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.left=n6;
        n3.right=n7;
        n5.left=n8;
        n5.right=n9;
        TreeNode result=lowestCommonAncestor(n1,n2,n3);
        System.out.println(result.val);
    }
}
