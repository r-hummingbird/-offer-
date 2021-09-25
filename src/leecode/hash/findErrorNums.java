package leecode.hash;

public class findErrorNums {
    public static int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] res=new int[2];
        for (int i = 0; i <n ; i++) {
            if (nums[i]!=i){
                res[0]=nums[i];
                res[1]=i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,2,4};
        int[] res=findErrorNums(nums);
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");
        }

    }
}
