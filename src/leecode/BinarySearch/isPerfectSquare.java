package leecode.BinarySearch;

public class isPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int res=0;
        int max=num;
        if(num==1)
            res=1;
        while(max-res>1){
            int m=(res+max)/2;
            if (num/m<m){
                max=m;
            }else {
                res=m;
            }
        }
        if (res*res==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num=14;
        System.out.println(isPerfectSquare(num));
    }
}
