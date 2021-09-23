package leecode.String;

public class buddyStrings {
    public static boolean buddyStrings(String s, String goal) {
        if (s.length()!=goal.length()||s.isEmpty()||goal.isEmpty())
            return false;
        if (s.equals(goal)){
            if (s.length() > 26) return true;
            int[] ins = new int[26];
            for (int i = 0; i < s.length(); i++) {
                if (++ins[s.charAt(i) - 97] == 2) return true;
            }
            return false;

        }
        int leftIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (leftIndex == -1) {
                    leftIndex = i;
                } else {
                    return s.charAt(i) == goal.charAt(leftIndex) && s.charAt(leftIndex) == goal.charAt(i) &&
                            s.substring(i+1).equals(goal.substring(i+1));
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String A="ab";
        String B="ba";
        System.out.println(buddyStrings(A,B));
    }
}
