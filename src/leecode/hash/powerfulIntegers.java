package leecode.hash;

import java.util.ArrayList;
import java.util.List;

public class powerfulIntegers {
    public static List<Integer> powerfulIntegers(int x, int y, int bound) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < bound; i *= x) {
            for (int j = 1; j < bound ; j *= y) {
                if ((i + j) <= bound && !arrayList.contains((i + j))) {
                    arrayList.add((i + j));
                }
                if (y == 1) {
                    break;
                }
            }
            if (x == 1) {
                break;
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int x=2,y=3,bound=10;
        List<Integer> res=powerfulIntegers(x,y,bound);
        System.out.println(res);
    }
}
