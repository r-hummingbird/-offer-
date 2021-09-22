package leecode.array;

//有参考
public class numEquivDominoPairs {
    public static int numEquivDominoPairs(int[][] dominoes) {
        int[] cnt = new int[89];
        int ans = 0;
        for (int[] dominoe : dominoes) {
            int idx = Math.min(dominoe[0], dominoe[1]) * 10 + Math.max(dominoe[0], dominoe[1]) - 11;
            ans += cnt[idx];
            cnt[idx]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] dominoes=new int[][]{{1,2},{2,1},{3,4},{5,6}};
        System.out.println(numEquivDominoPairs(dominoes));
    }
}
