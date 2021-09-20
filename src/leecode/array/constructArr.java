package leecode.array;

public class constructArr {
    public static int[] constructArr(int[] a) {
        int[] b=new int[a.length];

        for (int i = 0,num=1; i <a.length;num*=a[i], i++) {
            b[i]=num;
        }
        for (int i = a.length-1,num=1; i >=0 ; num*=a[i],i--) {
            b[i]*=num;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5};
        int[] result=constructArr(a);
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
