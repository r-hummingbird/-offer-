package leecode.array;

public class duplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int i, count = 0;
        for (i = 0; count < arr.length; i++)
            count += arr[i] == 0 ? 2 : 1;
        i--;
        for (int j = arr.length - 1; j >= 0; j--, i--) {
            if (j == arr.length - 1 && arr[i] == 0 && count > arr.length) {
                arr[j] = 0;
                continue;
            }
            if (arr[i] != 0) {
                arr[j] = arr[i];
            } else {
                arr[j] = 0;
                arr[--j] = 0;
            }
        }
        for (int j= 0;  j<arr.length ; j++) {
            System.out.print(arr[j]+" ");
        }



    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }
}
