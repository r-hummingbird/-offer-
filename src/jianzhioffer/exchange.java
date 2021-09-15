package jianzhioffer;

public class exchange {
    public static int[] exchange(int[] nums) {
        int[] result=new int[nums.length];
        int j=0;
        int k=nums.length-1;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]%2==1){
                result[j]=nums[i];
                j++;
            }else {
                result[k]=nums[i];
                k--;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] result=exchange(nums);
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]);
        }
    }
}
