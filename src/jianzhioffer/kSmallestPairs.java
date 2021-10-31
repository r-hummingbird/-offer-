package jianzhioffer;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class kSmallestPairs {
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> queue=new PriorityQueue<>((a,b)->b[0]+b[1]-a[0]-a[1]);
        int len1=Math.min(k,nums1.length);
        int len2=Math.min(k,nums2.length);
        for (int i = 0; i <len1 ; i++) {
            for (int j = 0; j <len2 ; j++) {
                if (queue.size()<k){
                    queue.add(new int[]{nums1[i],nums2[i]});
                }else {
                    int[] peek=queue.peek();
                    if (nums1[i]+nums2[i]<(peek[0]+peek[1])){
                        queue.poll();
                        queue.add(new int[]{nums1[i],nums2[i]});
                    }
                }
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        while (!queue.isEmpty()){
            int[] a=queue.poll();
            List<Integer> b=new ArrayList<>();
            b.add(a[0]);
            b.add(a[1]);
            res.add(b);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1=new int[]{1,7,11};
        int[] nums2=new int[]{2,4,6};
        int k=3;
        System.out.println(kSmallestPairs(nums1,nums2,k));
    }
}
