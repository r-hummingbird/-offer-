package leecode.array;

public class maxDistToClosest {
    public static int maxDistToClosest(int[] seats) {
        int dis = 0,maxDis = 0,res = 0;
        boolean flag = false;
        for(int seat : seats){
            if(seat == 0) ++dis;
            else {
                if(!flag) {
                    res = dis;
                    flag = true;
                }
                maxDis = Math.max(maxDis,dis);
                dis = 0;
            }
        }
        // 记录到尾的距离
        if(dis != 0) res = Math.max(dis,res);
        //System.out.println(res + " " + maxDis);

        return Math.max(res,(maxDis - 1) / 2 + 1);

    }

    public static void main(String[] args) {
        int[] seats=new int[]{0,0,1};
        System.out.println(maxDistToClosest(seats));
    }
}
