package leecode.BinarySearch;

public class findPeakElement {
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = (left + right) / 2;
        while (left != mid && right != mid) {
            if (nums[mid] < nums[mid + 1]) {
                left = mid;
            } else {
                right = mid;
            }
            mid = (left + right) / 2;
        }
        mid = nums[left] > nums[right] ? left : right;

        return mid;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,1};
        System.out.println(findPeakElement(nums));

    }
}
