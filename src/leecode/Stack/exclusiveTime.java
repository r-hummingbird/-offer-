package leecode.Stack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class exclusiveTime {
    public static int[] exclusiveTime(int n, List<String> logs) {
        Stack<int[]> stack=new Stack<>();
        int[] res=new int[n];
        for (String log:logs){
            String[] split = log.split(":");
            int id = Integer.parseInt(split[0]);
            int time = Integer.parseInt(split[2]);
            if ("start".equals(split[1])){
                stack.push(new int[]{id,time});
            }else {
                int[] pop = stack.pop();
                int interval = time - pop[1] + 1;
                res[pop[0]] += interval;
                if (!stack.isEmpty()) {
                    res[stack.peek()[0]] -= interval;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n=2;
        List<String> log=new LinkedList<>();
        log.add("0:start:0");
        log.add("1:start:2");
        log.add("1:end:5");
        log.add("0:end:6");
        int[] res=exclusiveTime(n,log);
        for (int item:res){
            System.out.print(item+" ");
        }
    }
}
