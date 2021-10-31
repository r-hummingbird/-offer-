package jianzhioffer;

public class peakIndexInMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int l=0,r=arr.length;
        while (l<=r){
            int mid=l+(r-l)/2;
            if (arr[mid+1]<arr[mid]&&arr[mid-1]<arr[mid])
                return mid;
            if (arr[mid+1]<arr[mid]&&arr[mid-1]>arr[mid])
                r=mid;
            if (arr[mid+1]>arr[mid]&&arr[mid-1]<arr[mid])
                l=mid;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
