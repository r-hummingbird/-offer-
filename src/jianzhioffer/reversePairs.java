package jianzhioffer;

public class reversePairs {
    //归并排序，在其过程中统计逆序数量，右边每次放上去都要加上：left.length - i
    static int count = 0;//统计归并过程中的逆序对数情况
    public static int reversePairs(int[] nums) {
        int len = nums.length;
        if(len < 2) return 0;//不构成任何一对
        mergesort(nums, 0, len - 1);
        return count;
    }

    public static int[] mergesort(int[] nums, int l, int h){
        if(l == h) return new int[]{nums[l]};//单个数据直接返回
        int mid = l + (h - l) / 2;
        int[] left = mergesort(nums, l, mid);
        int[] right = mergesort(nums, mid + 1, h);
        int[] res = new int[h - l + 1];
        int i = 0, j = 0, m = 0;
        while (i < left.length && j < right.length) {
            if(left[i] <= right[j]){
                res[m++] = left[i++];
            }else{
                res[m++] = right[j++];
                count += left.length - i;
            }
        }
        while (i < left.length)
            res[m++] = left[i++];
        while (j < right.length)
            res[m++] = right[j++];
        return res;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{4,5,6,7};
        System.out.println(reversePairs(nums));
    }
}
