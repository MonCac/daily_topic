package leetbooks.primary_algorithms;

// 买卖股票的最佳时机 II

public class No_01_002 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 1)
            return 0;
        int ans = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1])
                ans += prices[i] - prices[i - 1];
        }
        return ans;
    }
}
