package jianzhioffer;

public class findMaximumXOR {
    static TrieNode root = new TrieNode();
    public static int findMaximumXOR(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            TrieNode current = root;
            for (int j = 30; j >= 0; j--) {
                current = current.insert((nums[i] >> j) & 1);
            }
        }

        int maxResult = 0;
        for (int i = 0; i < nums.length; i++) {
            int binary = 0;
            TrieNode current = root;
            for (int j = 30; j >= 0; j--) {
                int index = (nums[i] >> j) & 1;
                if (current.trieNodes[1 - index] == null) {
                    current = current.trieNodes[index];
                } else {
                    binary |= 1 << j;
                    current = current.trieNodes[1 - index];
                }
            }
            maxResult = Math.max(binary, maxResult);
        }

        return maxResult;
    }
    static class TrieNode {

        TrieNode[] trieNodes = new TrieNode[2];

        public TrieNode insert(int index) {
            if (trieNodes[index] == null) {
                trieNodes[index] = new TrieNode();
            }
            return trieNodes[index];
        }

    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,10,5,25,2,8};
        System.out.println(findMaximumXOR(nums));
    }
}
