package leecode.backTrack;

import java.util.Map;

public class judgePoint24 {
    public static boolean judgePoint24(int[] cards) {
        double[] arr=new double[]{cards[0],cards[1],cards[2],cards[3]};
        return backTrack(arr);
    }

    private static boolean backTrack(double[] arr) {
        if (arr.length==1){
            return Math.abs(arr[0]-24)<0.001;
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                double[] temp=new double[arr.length-1];
                for (int k = 0,index=0; k <arr.length ; k++) {
                    if (k!=i&&k!=j){
                        temp[index++]=arr[k];
                    }
                }
                for (double num:calculate(arr[i],arr[j])){
                    temp[temp.length-1]=num;
                    if (backTrack(temp)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static double[] calculate(double a, double b) {
        return new double[]{a+b,a-b,b-a,a*b,a/b,b/a};
    }

    public static void main(String[] args) {
        int[] nums=new int[]{4,1,8,7};
        System.out.println(judgePoint24(nums));
    }
}
