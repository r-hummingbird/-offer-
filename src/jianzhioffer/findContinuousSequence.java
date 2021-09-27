package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class findContinuousSequence {
    public static int[][] findContinuousSequence(int target) {
        List<int[]> list=new LinkedList<>();
        int left=1,right=1,sum=0;
        for (int i = 1; i <=target/2+1 ; i++) {
            sum+=i;
            right++;
            while (sum>target&&left<right){
                sum-=left;
                left++;

            }
            if (sum==target){
                int[] temp=new int[right-left];
                int count=0;
                for (int j = left; j <right ; j++) {
                    temp[count++]=j;
                }
                list.add(temp);
            }
        }
        int[][] res=new int[list.size()][];
        int count=0;
        for (int[] item:list){
            res[count++]=item;
        }
        
        return res;

    }

    public static void main(String[] args) {
        int target=9;
        findContinuousSequence(target);
    }
}
