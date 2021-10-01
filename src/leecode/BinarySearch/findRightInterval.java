package leecode.BinarySearch;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
//有参考完全没理解
public class findRightInterval {
    public static int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        for (int i = 0; i <n ; i++) {
            intervals[i]=new int[]{intervals[i][0],intervals[i][1],i};
        }
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));
        int[] ans=new int[n];
        for (int i = 0; i <n ; i++) {
            int low=i,high=n-1,tar=intervals[i][1];
            while (low<=high){
                int mid = low+( high-low) /2;
                if (intervals[mid][0] >= tar) high = mid - 1;
                else low = mid + 1;
            }
            ans[intervals[i][2]] = low == n ? -1 : intervals[low][2];
        }
        return ans;
    }


    public static void main(String[] args) {
        int[][] intervals={{3,4},{2,3},{1,2}};
        int[] res=findRightInterval(intervals);
        for (int item:res){
            System.out.print(item+" ");
        }

    }
}
