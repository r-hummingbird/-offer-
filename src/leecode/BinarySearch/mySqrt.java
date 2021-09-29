package leecode.BinarySearch;
//牛顿迭代法
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
                System.out.println(max+"max");
            }else {

                res=m;
                System.out.println(res+"res");
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int x=18;
        System.out.println(mySqrt(x));
    }

}
