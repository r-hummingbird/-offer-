package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class mirrorTree {
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
    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode tmpNode = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmpNode);
        return root;

    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4,2,7,1,3,6,9};
        TreeNode root = createBinaryTreeByArray(arr,0);
        System.out.println(levelOrder(root));
        TreeNode result=mirrorTree(root);
        System.out.println(levelOrder(result));



    }
}
