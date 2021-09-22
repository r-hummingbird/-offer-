package leecode.array;

public class validMountainArray {
    public static boolean validMountainArray(int[] arr) {
        int max=Integer.MIN_VALUE,pos=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                pos=i;
                max=arr[i];
            }
        }
        if (pos==0||pos==arr.length-1)
            return false;
        for (int i = 0; i <pos ; i++) {
            if (arr[i]>=arr[i+1])
                return false;
        }
        for (int i = pos; i <arr.length-1 ; i++) {
            if (arr[i]<=arr[i+1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{3,5,5};
        System.out.println(validMountainArray(arr));
    }
}
