package a_daily_topic;

// 子序列宽度之和

import java.util.Arrays;

public class No_0891 {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3};
        sumSubseqWidths(nums);
    }
    static int mod = (int)1e9+7;
    public static int sumSubseqWidths(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int len = nums.length;
        ans = (nums[len - 1] * ((int)Math.pow(2,len - 1) - 1) - nums[0] * ((int)Math.pow(2,len - 1) - 1)) % mod;
        for (int i = 1; i < len - 1; i++){
            int sum = (nums[i] * ((int)Math.pow(2,i) - 1) - nums[i] * ((int)Math.pow(2,len - 1 - i) - 1)) % mod;
            ans = (ans + sum) % mod;
        }
        return ans;
    }
}
