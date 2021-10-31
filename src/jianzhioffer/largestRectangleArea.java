package jianzhioffer;

public class largestRectangleArea {
    public static int largestRectangleArea(int[] heights) {
        int max = 0;
        int left = 0;
        int right = 0;
        for(int i =0;i<heights.length;i++){
            left = i-1;
            right = i+1;
            if(heights.length * heights[i]>max){
                while(left>=0 && heights[left]>=heights[i]){
                    left--;
                }
                while(right<=heights.length-1 && heights[right]>=heights[i]){
                    right++;
                }
                max = Math.max(max,(right - left - 1)*heights[i]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights=new int[]{4,2,0,3,2,4,3,4};
        System.out.println(largestRectangleArea(heights));
    }
}
