package jianzhioffer;

import java.util.ArrayList;

public class inorderSuccessor {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static ArrayList<TreeNode> inorderSeq;
    public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        inorderSeq=new ArrayList<>();
        inorder(root);
        for (int i = 0; i <inorderSeq.size() ; i++) {
            if (inorderSeq.get(i).val==p.val){
                if (i+1<inorderSeq.size())
                    return inorderSeq.get(i+1);
                else
                    return null;
            }
        }
        return null;
    }

    private static void inorder(TreeNode root) {
        if (root==null)
            return;
        inorder(root.left);
        inorderSeq.add(root);
        inorder(root.right);
    }


    public static void main(String[] args) {
        TreeNode n1=new TreeNode(2);
        TreeNode n2=new TreeNode(1);
        TreeNode n3=new TreeNode(3);
        n1.left=n2;
        n1.right=n3;
        TreeNode res=inorderSuccessor(n1,n2);
        System.out.println(res.val);
    }
}
