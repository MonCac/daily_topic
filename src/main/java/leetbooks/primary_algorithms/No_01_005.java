package leetbooks.primary_algorithms;

// 只出现一次的数字

import java.util.Arrays;

public class No_01_005 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i = i + 2){
            if(nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
