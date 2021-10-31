package leecode.Greedy;

public class minDeletionSize {
    public static int minDeletionSize(String[] strs) {
        int res=0;
        int len=strs[0].length();
        for (int i = 0; i <len ; i++) {
            for (int j = 1; j <strs.length ; j++) {
                if (strs[j].charAt(i)<strs[j-1].charAt(i)){
                    res+=1;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs=new String[]{"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));
    }
}
