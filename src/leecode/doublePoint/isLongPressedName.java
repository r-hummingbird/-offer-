package leecode.doublePoint;

public class isLongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        char[] ch=name.toCharArray();
        char[] ch1=typed.toCharArray();
        int n_len=name.length();
        int t_len=typed.length();
        if (n_len>t_len)
            return false;
        int i=0,j=0;
        while (i<n_len&&j<t_len){
            if (ch[i]==ch1[j]){
                i++;
                j++;
            }else if (j>0&&ch1[j]==ch1[j-1]){
                j++;
            }
            else {
                return false;
            }
        }
        if(j<typed.length())
        {
            char c=name.charAt(name.length()-1);
            while (j<typed.length())
            {
                if(c==typed.charAt(j))
                    j++;
                else
                    return false;
            }
        }

        return i==n_len;
    }

    public static void main(String[] args) {
        String name="alex";
        String typed="aaleexa";
        System.out.println(isLongPressedName(name,typed));
    }
}
