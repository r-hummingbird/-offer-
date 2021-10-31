package jianzhioffer;

public class maxPathSum {
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
    static int max=Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root) {

        dfs(root);
        return max;

    }

    private static int dfs(TreeNode root) {
        if (root==null)
            return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
        if (max<left+right+root.val)
            max=left+right+root.val;
        return Math.max(0,Math.max(left,right)+root.val);
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(-10);
        TreeNode n2=new TreeNode(9);
        TreeNode n3=new TreeNode(20);
        TreeNode n4=new TreeNode(15);
        TreeNode n5=new TreeNode(7);
        n1.left=n2;
        n1.right=n3;
        n3.left=n4;
        n3.right=n5;
        System.out.println(maxPathSum(n1));

    }

}
