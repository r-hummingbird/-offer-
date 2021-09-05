package jianzhioffer;

import java.util.Random;

public class findRepeatNumber {
    public static int findRepeatNumber(int[] nums){
//        因为只有n个数因此对 每个进行计数超过1则证明不止一个数因此有重复
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
            if(arr[nums[i]] > 1) return nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Random rand=new Random();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            int data = rand.nextInt(100);
            arr[i]=data;
        }
        for (int i = 0; i <100 ; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n重复数是"+findRepeatNumber(arr));


    }
}
