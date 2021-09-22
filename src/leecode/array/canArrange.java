package leecode.array;

public class canArrange {
    public static boolean canArrange(int[] arr, int k) {
        int len = arr.length;
        int[] nums = new int[k];
        for(int i = 0;i < len;i ++){
            int temp = arr[i] % k;
            if(temp < 0){
                temp += k;
            }
            nums[temp] ++;
        }
        int start = 1;
        int end = k - 1;
        if(nums[0] % 2 != 0){
            return false;
        }
        while(start <= end){
            if(nums[start] == nums[end]){
                start ++;
                end --;
            }else{
                return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,10,6,7,8,9};
        int k=5;
        System.out.println(canArrange(arr,k));
    }
}
