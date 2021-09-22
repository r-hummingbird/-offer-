package leecode.array;

public class maxArea {
    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {  // 移动较小的那一端
                ++l;
            }
            else {
                --r;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height=new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
