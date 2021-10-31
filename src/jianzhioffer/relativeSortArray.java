package jianzhioffer;

import java.util.*;

public class relativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int num:arr1){
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        for (int num:arr2){
            int temp=map.get(num);
            for (int i = 0; i <temp ; i++) {
                list.add(num);
            }
        }
        for (int num:arr1){
            if (!list.contains(num)){
                list1.add(num);
            }
        }
        Collections.sort(list1);
        for (int num:list1){
            list.add(num);
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = list.get(i);
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1=new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2=new int[]{2,1,4,3,9,6};
        int[] res=relativeSortArray(arr1,arr2);
        for (int item:res){
            System.out.print(item+" ");
        }
    }
}
