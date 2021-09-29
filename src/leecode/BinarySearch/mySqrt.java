package leecode.BinarySearch;

public class mySqrt {
    public static int mySqrt(int x) {
        int res=0;
        int max=x;
        if(x==1)
            res=1;
        while(max-res>1){
            int m=(res+max)/2;
            if (x/m<m){
                max=m;
            }else {
                res=m;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int x=2147395599;
        System.out.println(mySqrt(x));
    }

}
