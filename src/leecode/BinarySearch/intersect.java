package leecode.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class intersect {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        for (int item:nums1){
            list.add(item);
            if (list.contains(item))
                continue;
        }
        List<Integer> list2 = new ArrayList<>();
        for (int item1:nums2){
            if (list.contains(item1)){
                list2.add(item1);
                list.remove(Integer.valueOf(item1));
            }
        }
        int[] res = new int[list2.size()];
        int i = 0;
        for (int num : list2) {
            res[i++] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1=new int[]{1,2,2,1};
        int[] nums2=new int[]{2,2};
        int[] res=intersect(nums1,nums2);
        for (int item:res){
            System.out.print(item+" ");
        }
    }
}
