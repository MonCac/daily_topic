package a_daily_topic;

// 多米诺和托米诺平铺

public class No_0790 {
    public static void main(String[] args){
        numTilings(4);
    }
    static int mod = (int)1e9+7;
    public static int numTilings(int n) {
        if(n == 1)
            return 1;
        int[][] dp = new int[2][4];
        dp[0][0] = dp[0][1] = 1;
        int flag = 1;
        int a = 1, b = 0;
        for (int i = 1; i < n; i++){
            if (flag == 1) {
                a = 1;
                b = 0;
            }else {
                a = 0;
                b = 1;
            }
            int cur = 0;
            dp[a][0] = dp[b][1];
            for(int j = 0; j < 4; j ++)
                cur = (cur + dp[b][j]) % mod;
            dp[a][1] = cur;
            dp[a][2] = (dp[b][3] + dp[b][0]) % mod;
            dp[a][3] = (dp[b][2] + dp[b][0]) % mod;
            flag = - flag;
        }
        return dp[a][1];
    }
}
