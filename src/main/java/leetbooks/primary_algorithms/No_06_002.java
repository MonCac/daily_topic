package leetbooks.primary_algorithms;

// 买卖股票的最佳时机

public class No_06_002 {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int price : prices) {
            if (minprice > price)
                minprice = price;
            else if (maxprofit < (price - minprice))
                maxprofit = price - minprice;
        }
        return maxprofit;
    }
}
