package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

public class pathSum {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int v) { val = v; }
    }

    // 定义成员变量
    static List<List<Integer>> list;
    static int sum, tar;
    static List<Integer> tmp;

    public static List<List<Integer>> pathSum(TreeNode root, int target) {
        // 为成员变量赋值
        sum = 0;
        tar = target;
        tmp = new ArrayList<>();
        list = new ArrayList<>();
        TreeNode cur=root;

        if (cur == null || target == 0) return list;        // 鲁棒性
        tmp.add(cur.val);          // 先加入根节点
        dfs(cur.val, cur);    // 先不加vis试一下
        return list;
    }

    public static void dfs(int nowSum, TreeNode nowRoot) {
        if (nowSum > tar) return;     // 剪枝
        // 遍历到了叶节点，且等于目标值，则该路径符合
        if ((nowRoot.left == null && nowRoot.right == null) && nowSum == tar) {
            list.add(new ArrayList<>(tmp));
            return;
        }

        if (nowRoot.left != null) {
            tmp.add(nowRoot.left.val);
//                System.out.println(tmp.toString());
            dfs(nowSum + nowRoot.left.val, nowRoot.left);
            tmp.remove(tmp.size() - 1);
        }
        if (nowRoot.right != null) {
            tmp.add(nowRoot.right.val);
//                System.out.println(tmp.toString());
            dfs(nowSum + nowRoot.right.val, nowRoot.right);
            tmp.remove(tmp.size() - 1);
        }
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
        Integer[] num= new Integer[]{5, 4, 8, 11,null, 13, 4, 7, 2, null,null,5, 1};
        TreeNode root=createBinaryTreeByArray(num,0);
        int target=22;
        List<List<Integer>>result=pathSum(root,target);
        System.out.println(result.toString());
    }
}
