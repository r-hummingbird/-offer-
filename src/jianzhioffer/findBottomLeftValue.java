package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class findBottomLeftValue {
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
    public static int findBottomLeftValue(TreeNode root) {
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        ArrayList<TreeNode> num=null;
        while (!queue.isEmpty()){
            int layer=queue.size();//层元素个数
            num=new ArrayList<>();
            for (int i = 0; i <layer ; i++) {
                TreeNode node=queue.poll();
                num.add(node);
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
            }
        }
        return num.get(0).val;
    }

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(2);
        TreeNode n2=new TreeNode(1);
        TreeNode n3=new TreeNode(3);
        n1.left=n2;
        n1.right=n3;
        System.out.println(findBottomLeftValue(n1));
    }
}
