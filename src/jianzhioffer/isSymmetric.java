package jianzhioffer;


public class isSymmetric {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    private static TreeNode createBinaryTreeByArray(Integer[] array, int index)
    {
        TreeNode tn = null;
        if (index<array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            tn = new TreeNode(value);
            tn.left = createBinaryTreeByArray(array, 2*index+1);
            tn.right = createBinaryTreeByArray(array, 2*index+2);
            return tn;
        }
        return tn;
    }

    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode tmpNode = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmpNode);
        return root;

    }
    public static boolean isSymmetric(TreeNode root) {
        TreeNode root1=mirrorTree(root);
        return dfs(root, root1);

    }

    private static boolean dfs(TreeNode A, TreeNode B) {
        if(B == null&&A==null) return true;
        if(B == null||A==null) return false;
        return A.val == B.val && dfs(A.left, B.right) && dfs(A.right, B.left);
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,2,3,4,4,3};
        TreeNode root = createBinaryTreeByArray(arr,0);

        System.out.println(isSymmetric(root));



    }
}
