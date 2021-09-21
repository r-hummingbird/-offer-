package leecode.array;

public class pivotIndex {
    public static int pivotIndex(int[] nums) {
        int[] b=new int[nums.length];
        int suml=0,sumr=0;
        for (int i = 0; i <nums.length ; i++) {
            suml+=nums[i];
            b[i]=suml;
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            sumr+=nums[i];
            b[i]=b[i]-sumr;
        }
        for (int i = 0; i <b.length ; i++) {
            if (b[i]==0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}
