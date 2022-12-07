package a_daily_topic;

// 最接近目标价格的甜点成本

public class No_1774 {
    public int closestCost(int[] base, int[] top, int V){
        boolean[] dp = new boolean[V + 5];
        int ans = Integer.MAX_VALUE;
        for (int x : base){
            if (x > V){
                ans = Math.min(ans,x);
            }
            else{
                dp[x] = true;
            }
        }
        for (int x : top){
            for(int i = 0; i < 2; i++){
                for (int j = V; j >= 0; j--){
                    if (dp[j] && j + x > V){
                        ans = Math.min(ans,j + x);
                    }
                    if (j > x){
                        dp[j] |= dp[j - x];
                    }
                }
            }
        }
        for (int i = 0; i <= ans - V && i <= V; i++){
            if (dp[V - i]) {
                return V - i;
            }
        }
        return ans;
    }
}
