package jianzhioffer;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class CBTInserter {
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
    static ArrayList<TreeNode> list;
    public CBTInserter(TreeNode root) {
        list=new ArrayList<>();
        Deque<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            list.add(node);
            if (node.left!=null){
                queue.add(node.left);
            }
            if (node.right!=null){
                queue.add(node.right);
            }
        }
    }

    public static int insert(int v) {
        TreeNode node=new TreeNode(v);
        list.add(node);
        TreeNode p=list.get(list.size()/2-1);
        if (p.left==null){
            p.left=node;
        }else {
            p.right=node;
        }
        return p.val;
    }

    public static TreeNode get_root() {
        return list.get(0);
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(1);
        CBTInserter obj = new CBTInserter(n1);
        int param_1 = obj.insert(2);
        TreeNode param_2 = obj.get_root();
        System.out.println(param_1+" "+param_2.val);
    }
}
