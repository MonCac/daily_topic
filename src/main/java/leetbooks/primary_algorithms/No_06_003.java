package leetbooks.primary_algorithms;

// 最大子序和

public class No_06_003 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int cur = nums[0];
        int max = cur;
        for(int i = 1; i < len; i++){
            cur = Math.max(cur,0) + nums[i];
            max = Math.max(cur,max);
        }
        return max;
    }
}
