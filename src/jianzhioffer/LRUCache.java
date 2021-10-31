package jianzhioffer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    private static class Node {
        int key;
        int val;
        public Node(int key,int val) {
            this.key=key;
            this.val=val;
        }
    }
    private int capacity;
    private LinkedList<Node> cache;
    private Map<Integer,Node> map;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        cache=new LinkedList<>();
        map=new HashMap<>();
    }

    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        int val=map.get(key).val;
        put(key,val);
        return val;
    }

    public void put(int key, int value) {
        Node node=new Node(key,value);
        if(map.containsKey(key)) {
            cache.remove(map.get(key));
        }
        else {
            if(capacity==cache.size()) {
                Node last=cache.removeLast();
                map.remove(last.key);
            }

        }
        cache.addFirst(node);
        map.put(key,node);
    }

    public static void main(String[] args) {
        LRUCache obj = new LRUCache(2);
        int param_1 = obj.get(1);
        obj.put(1,1);
    }
}
