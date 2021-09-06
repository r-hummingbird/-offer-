package jianzhioffer;

import java.util.Random;

public class search {
    public static int search(int[] nums, int target) {
        int num=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==target){
                num++;
            }
        }
        return num;
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
        System.out.println();
        int num=search(arr,8);
        System.out.println(num);

    }
}
