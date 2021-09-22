package leecode.String;
//有参考
public class addBinary {
    public static String addBinary(String a, String b) {
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;

        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int p = 0;//进位
        while (i >= 0 && j >= 0) {
            int ai = a.charAt(i) - '0';
            int bj = b.charAt(j) - '0';
            sb.append((ai + bj + p) % 2);
            p = (ai + bj + p) / 2;//更新进位
            --i;
            --j;
        }
        while (i >= 0) {
            int ai = a.charAt(i) - '0';
            sb.append((ai + p) % 2);
            p = (ai + p) / 2;
            --i;
        }
        while (j >= 0) {
            int bj = b.charAt(j) - '0';
            sb.append((bj + p) % 2);
            p = (bj + p) / 2;
            --j;
        }
        if (p == 1) sb.append(1);
        sb.reverse();
        return sb.toString();



    }

    public static void main(String[] args) {
        String a="11";
        String b="1";
        String result=addBinary(a,b);
        System.out.println(result);
    }
}
