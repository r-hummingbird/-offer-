package jianzhioffer;

public class countBits {
    public static int[] countBits(int n) {
        int[] res=new int[n+1];
        for (int i = 0; i <n+1 ; i++) {
            int count = 0;
            int num=i;
            while (num!=0){
                num=num&(num-1);
                count++;
            }
            res[i]=count;
        }
        return res;
    }

    public static void main(String[] args) {
        int n=5;
        int[] res=countBits(n);
        for (int num:res){
            System.out.print(num+" ");
        }
    }
}
