package jianzhioffer;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class rightSideView {
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
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode right = root;
        if(root==null) return list;
        list.add(root.val);
        while (queue.isEmpty()==false){
            TreeNode p = queue.poll();
            if(p.left!=null) queue.addLast(p.left);
            if(p.right!=null) queue.addLast(p.right);
            if(right ==p){
                right = queue.peekLast();//指向最后
                if(right!=null) list.add(right.val);
            }

        }
        return  list;
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(1);
        TreeNode n2=new TreeNode(2);
        TreeNode n3=new TreeNode(3);
        TreeNode n4=new TreeNode(5);
        TreeNode n5=new TreeNode(4);
        n1.left=n2;
        n1.right=n3;
        n2.right=n4;
        n3.right=n5;
        System.out.println(rightSideView(n1));
    }
}
