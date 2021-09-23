package jianzhioffer;
//有参考
public class verifyPostorder {

    public static boolean verifyPostorder(int[] postorder) {
        int n = postorder.length;
        if (n == 0) return true;
        return dfs(postorder, 0, n - 1);
    }

    private static boolean dfs(int[] postorder, int l, int r) {
        if (l >= r) return true;
        int root = postorder[r];
        int k = l;
        while (k < r && postorder[k] < root) k ++ ;
        for (int i = k; i < r; i ++ )
            if (postorder[i] < root)
                return false;
        return dfs(postorder, l, k - 1) && dfs(postorder, k, r - 1);
    }


    public static void main(String[] args) {

        int[] postorder=new int[]{1,6,3,2,5};
        System.out.println(verifyPostorder(postorder));

    }
}
