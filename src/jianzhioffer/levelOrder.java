package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

    }
    public static int[] levelOrder(TreeNode root) {
        if(root==null)return new int[0];
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<Integer> list=new ArrayList<Integer>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            list.add(node.val);
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
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


    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3,9,20,null,null,15,7};
        TreeNode root = createBinaryTreeByArray(arr,0);
        int[] result=levelOrder(root);
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+" ");
        }



    }
}
