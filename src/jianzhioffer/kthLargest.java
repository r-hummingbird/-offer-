package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

public class kthLargest {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static int kthLargest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        sort(root,list);
        return list.get(list.size()-k);

    }
    public static void sort(TreeNode root,List<Integer> list){
        if (root == null) return;
        if (root.left != null) sort(root.left, list);
        list.add(root.val);
        if (root.right != null) sort(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(3);
        TreeNode n2=new TreeNode(1);
        TreeNode n3=new TreeNode(4);
        TreeNode n4=new TreeNode(2);
        n1.left=n2;
        n1.right=n3;
        n2.right=n4;
        System.out.println(kthLargest(n1,1));

    }
}
