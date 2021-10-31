package jianzhioffer;

import java.util.*;

public class topKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        for (int i = 0; i <k ; i++) {
            ans[i]=list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,1,1,2,2,3};
        int k=2;
        int[] res=topKFrequent(nums,k);
        for (int item:res){
            System.out.print(item+" ");
        }
    }
}
