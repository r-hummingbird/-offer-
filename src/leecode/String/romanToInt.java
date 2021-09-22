package leecode.String;

import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    public static int romanToInt(String s) {
        Map<Character,Integer> dictMap = new HashMap<>();
        dictMap.put('I',1);
        dictMap.put('V',5);
        dictMap.put('X',10);
        dictMap.put('L',50);
        dictMap.put('C',100);
        dictMap.put('D',500);
        dictMap.put('M',1000);

        int last = 0;
        int result = 0;
        for (int i=0;i<s.length();i++){
            if (last == 0){
                last = dictMap.get(s.charAt(i));
                result += last;
            }else {
                if (last >= dictMap.get(s.charAt(i))){
                    last =  dictMap.get(s.charAt(i));
                    result += last;

                } else {
                    result = result + (dictMap.get(s.charAt(i))-last*2);
                    last = dictMap.get(s.charAt(i));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s="III";
        System.out.println(romanToInt(s));
    }
}
