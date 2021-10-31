package leecode.DynamicProgramming;

public class divisorGame {
    public static boolean divisorGame(int n) {
        boolean[]f=new boolean[n+1];
        if (n==1)
            return false;
        if (n==2)
            return true;
        if (n==3)
            return false;
        for (int i=3;i<=n;i++){
            for (int j = 1; j <i ; j++) {
                if ((i%j)==0&&!f[i-j]){
                    f[i]=true;
                    break;
                }
            }
        }
        return f[n];
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(divisorGame(n));
    }
}
