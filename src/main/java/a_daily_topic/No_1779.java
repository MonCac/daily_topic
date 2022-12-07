package a_daily_topic;

// 找到最近的有相同X或Y坐标的点

public class No_1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans = -1;
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++){
            if (x == points[i][0] || y == points[i][1]){
                int now = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (now < len){
                    len = now;
                    ans = i;
                }
            }
        }
        return ans;
    }
}
