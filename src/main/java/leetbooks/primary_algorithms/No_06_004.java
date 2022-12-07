package leetbooks.primary_algorithms;

// 打家劫舍

public class No_06_004 {
    public static void main(String[] args){
        int[] a = new int[]{2,7,9,3,1};
        System.out.println(rob(a));
    }
    public static int rob(int[] nums) {
        int len = nums.length;
        if(len == 1)
            return nums[0];
        if(len == 2)
            return Math.max(nums[0],nums[1]);
        int first = nums[0];
        int second = Math.max(nums[1],nums[0]);
        for(int i = 2; i < len; i++){
            int temp = second;
            second = Math.max(first + nums[i],second);
            first = temp;
        }
        return second;
    }
}
