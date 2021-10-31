package leecode.doublePoint;

import java.util.ArrayList;
import java.util.List;

public class intervalIntersection {
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList.length==0||secondList.length==0){
            int[][] res=new int[0][];
            return res;
        }
        int l=0,r=0,x=0,y=0,count=0;
        List<Integer> list=new ArrayList<>();
        while (l<firstList.length&&r<secondList.length){
            x=Math.max(firstList[l][0],secondList[r][0]);
            y=Math.min(firstList[l][1],secondList[r][1]);
            if (x<=y){
                list.add(x);
                list.add(y);
            }
            if (firstList[l][1]<secondList[r][1]){
                l++;
            }else if (firstList[l][1]>secondList[r][1]){
                r++;
            }else {
                l++;
                r++;
            }
        }
        int[][] result=new int[list.size()/2][2];
        while (count<list.size()){
            result[count/2][0]=list.get(count++);
            result[count/2][1]=list.get(count++);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] firstList=new int[][]{{0,2},{5,10},{13,23},{24,25}};
        int[][] secondList=new int[][]{{1,5},{8,12},{15,24},{15,26}};
        int[][] res=intervalIntersection(firstList,secondList);
        for (int i = 0; i <res.length ; i++) {
            for (int j = 0; j <res[0].length; j++) {
                System.out.print(res[i][j]+" ");
            }
        }

    }
}
