package a_daily_topic;

// 全局倒置与局部倒置

public class No_0775 {
    public boolean isIdealPermutation(int[] nums) {
        int n = nums.length;
        int minSuff = nums[n - 1];
        for(int i = n - 3; i >= 0; i--){
            if (nums[i] > minSuff)
                return false;
            minSuff = Math.min(minSuff,nums[i + 1]);
        }
        return true;
    }
}
