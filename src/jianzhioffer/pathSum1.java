package jianzhioffer;

public class pathSum1 {
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
    public static int pathSum(TreeNode root, int targetSum) {
        if (root==null)
            return 0;
        return dfs(root,0,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }

    private static int dfs(TreeNode root, int count, int targetSum) {
        if (root==null)
            return 0;
        int res=0;
        count+=root.val;
        if (count==targetSum)
            res++;
        res+=dfs(root.left,count,targetSum)+dfs(root.right,count,targetSum);
        return res;
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(10);
        TreeNode n2=new TreeNode(5);
        TreeNode n3=new TreeNode(-3);
        TreeNode n4=new TreeNode(3);
        TreeNode n5=new TreeNode(2);
        TreeNode n6=new TreeNode(11);
        TreeNode n7=new TreeNode(3);
        TreeNode n8=new TreeNode(-2);
        TreeNode n9=new TreeNode(1);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.right=n6;
        n4.left=n7;
        n4.right=n8;
        n5.right=n9;
        int targetSum=8;
        System.out.println(pathSum(n1,targetSum));


    }
}
