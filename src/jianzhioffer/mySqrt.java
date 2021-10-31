package jianzhioffer;

public class mySqrt {
    public static int mySqrt(int x) {
        int start = 0, end = x;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if ((long)mid * mid <= x) {
                start = mid + 1;
                res = mid;
            } else {
                end = mid -1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int x=8;
        System.out.println(mySqrt(x));
    }
}
