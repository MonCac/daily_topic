package leetbooks.primary_algorithms;

// 爬楼梯
public class No_06_001 {
    public int climbStairs(int n) {
        if(n == 1)
            return 1;
        int[] ans = new int[n];
        ans[0] = 1;
        ans[1] = 2;
        for(int i = 2; i < n; i++){
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n - 1];
    }
}
