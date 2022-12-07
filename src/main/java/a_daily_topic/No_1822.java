package a_daily_topic;

// 数组元素积的符号

public class No_1822 {
    public int arraySign(int[] nums) {
        int len = nums.length;
        int ans = 1;
        for (int num : nums) {
            if (num < 0)
                ans = -ans;
            if (num == 0)
                return 0;
        }
        return ans;
    }
}
