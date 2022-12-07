package a_daily_topic;

// 检查数组是否经过排序和轮转得到

public class No_1752 {
    public boolean check(int[] nums) {
        int ans = -1;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] > nums[i+1]){
                if (ans != -1) {
                    return false;
                }
                ans = i;
            }
        }
        if (ans == -1) {
            return true;
        }
        return nums[0] >= nums[nums.length - 1];
    }
}
