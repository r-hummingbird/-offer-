package leecode.hash;

import java.util.*;

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
public class RandomizedSet {
    /** Initialize your data structure here. */
    static List<Integer> list=new ArrayList<>();
    static Map<Integer,Integer> map=new HashMap<>();
    static Random random=new Random();
    public RandomizedSet() {

    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public static boolean insert(int val) {
        if (map.containsKey(val)){
            return false;
        }
        list.add(val);
        map.put(val,list.size()-1);
        return true;

    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public static boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        int i=map.get(val);
        int n=list.get(list.size()-1);
//        转换位置
        list.set(i,n);
        list.remove(list.size()-1);
        map.put(n,i);
        map.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public static int getRandom() {
        return list.get(random.nextInt(list.size()));
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(2);
        boolean param_4 = obj.insert(5);
        boolean param_2 = obj.remove(1);
        int param_3 = obj.getRandom();
        System.out.println(param_1+" "+param_2+" "+param_3+" "+param_4+" ");
    }
}
