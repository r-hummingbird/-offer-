package jianzhioffer;

import java.util.*;

public class Codec {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static String sb=null;
    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if (root==null){
            return "null," ;
        }
        sb= new String();
        sb=root.val+",";
        sb+=serialize(root.left);
        sb+=serialize(root.right);
        return sb;

    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        Queue<String> queue=new LinkedList<String>();
        for (int i = 0; i <arr.length ; i++) {
            queue.offer(arr[i]);
        }
        return deserialize(queue);
    }
    public static TreeNode deserialize(Queue<String> queue){
        String val=queue.poll();
        if (val.equals("null")){
            return null;
        }
        TreeNode root=new TreeNode(Integer.valueOf(val));
        root.left=deserialize(queue);
        root.right=deserialize(queue);
        return root;
    }

    public static void main(String[] args) {
        Codec codec = new Codec();
        TreeNode n1=new TreeNode(1);
        TreeNode n2=new TreeNode(2);
        TreeNode n3=new TreeNode(3);
        TreeNode n4=new TreeNode(4);
        TreeNode n5=new TreeNode(5);
        n1.left=n2;
        n1.right=n3;
        n2.left=null;
        n2.right=null;
        n3.left=n4;
        n3.right=n5;
        TreeNode res=codec.deserialize(codec.serialize(n1));
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> xianxu = new ArrayList<Integer>();
        while (res!=null||!stack.isEmpty()){
            while (res!=null){
                xianxu.add(res.val);
                stack.push(res);
                res=res.left;
            }
            if (!stack.isEmpty()){
                res=stack.pop();
                res=res.right;
            }
        }
        for (Integer integer:xianxu){
            System.out.print(integer+" ");
        }
    }

}
