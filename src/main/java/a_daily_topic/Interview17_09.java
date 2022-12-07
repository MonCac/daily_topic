package a_daily_topic;

// 第k个数

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Interview17_09 {
    public int getKthMagicNumber(int k) {
        int[] factors = new int[]{3,5,7};
        int[] dp = new int[k];
        dp[0] = 1;
        int dp1 = 0, dp2 = 0, dp3 = 0;
        for(int i = 0; i < k - 1; i++){
            int num1 = dp[dp1] * 3, num2 = dp[dp2] * 5, num3 = dp[dp3] * 7;
            dp[i + 1] = Math.min(Math.min(num1,num2),num3);
            if(dp[i + 1] == num1)
                dp1++;
            if(dp[i + 1] == num2)
                dp2++;
            if(dp[i + 1] == num3)
                dp3++;

        }
        return dp[k - 1];
    }
}
