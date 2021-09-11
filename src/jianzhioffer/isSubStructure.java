package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class isSubStructure {
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
    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null) return false;
        return dfs(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }
    public static boolean dfs(TreeNode A, TreeNode B){
        if(B == null) return true;
        if(A == null) return false;
        return A.val == B.val && dfs(A.left, B.left) && dfs(A.right, B.right);
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists=new ArrayList<>();
        if(root==null) return lists;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            for (int i = 0; i <size ; i++) {
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
            lists.add(list);
        }
        return lists;

    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3,4,5,1,2};
        Integer[] arr1=new Integer[]{4,1};
        TreeNode root = createBinaryTreeByArray(arr,0);
        TreeNode root1=createBinaryTreeByArray(arr1,0);
        System.out.println(levelOrder(root));
        System.out.println(levelOrder(root1));
        System.out.println(isSubStructure(root,root1));

    }
}
