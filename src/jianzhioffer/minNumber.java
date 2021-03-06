package jianzhioffer;

import java.util.Arrays;
import java.util.Comparator;

public class minNumber {
    public static String minNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        int[] nums=new int[]{10,2};
        System.out.println(minNumber(nums));
    }
}
