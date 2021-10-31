package jianzhioffer;

public class maximalRectangle {
    public static int maximalRectangle(String[] matrix) {
        if(matrix.length==0){
            return 0;
        }
        int res=0;
        int[] heights=new int[matrix[0].length()];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length() ; j++) {
                if (matrix[i].charAt(j)=='1'){
                    heights[j]++;
                }else {
                    heights[j]=0;
                }
            }
            res=Math.max(res,largestRectangleArea(heights));
        }
        return res;
    }
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
        String[] matrix={"10100","10111","11111","10010"};
        System.out.println(maximalRectangle(matrix));
    }
}
