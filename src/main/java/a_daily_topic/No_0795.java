package a_daily_topic;

// 区间子数组个数

public class No_0795 {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int res = 0, s = 0, m = 0, l = 0;
        for (int num : nums){
            if (num < left){
                s++;
                m++;
            }else if(num <= right){
                s = 0;
                m++;
            }else{
                s = 0;
                m = 0;
            }
            res = res + m - s;
        }
        return res;
    }
}
