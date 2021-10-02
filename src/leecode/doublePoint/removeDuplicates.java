package leecode.doublePoint;


public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
        int len=removeDuplicates(nums);
        for (int i = 0; i < len-1; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
