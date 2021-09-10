package jianzhioffer;

import java.util.*;

public class levelOrder2 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        //链表的头插法
        boolean flag = false;
        while(!queue.isEmpty()) {
            LinkedList<Integer> list = new LinkedList<>();
            for(int i = queue.size();i>0;i--) {
                TreeNode front = queue.poll();
                if(flag) {
                    list.addFirst(front.val);
                } else {
                    list.addLast(front.val);
                }
                if(front.left != null) queue.offer(front.left);
                if(front.right != null) queue.offer(front.right);
            }
            flag = !flag;
            res.add(list);
        }
        return res;
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
        List<List<Integer>> lists=new ArrayList<>();
        lists=levelOrder(root);

        System.out.print(lists.toString());


    }
}
