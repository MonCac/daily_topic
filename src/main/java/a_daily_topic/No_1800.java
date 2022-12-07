package a_daily_topic;

// 最大升序子数组和

public class No_1800 {
    public static void main(String[] args){
        int[] nums = new int[]{10,20,30,5,10,50};
        int a = maxAscendingSum(nums);
    }
    public static int maxAscendingSum(int[] nums) {
        int ans = 0;
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1])
                sum += nums[i];
            else {
                if(ans < sum)
                    ans = sum;
                sum = nums[i];
            }
        }
        if(ans < sum)
            ans = sum;
        return ans;
    }
}
