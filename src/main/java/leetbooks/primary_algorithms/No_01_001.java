package leetbooks.primary_algorithms;

// 删除排序数组中的重复项

public class No_01_001 {
    public int removeDuplicates(int[] nums) {
        if(nums == null)
            return 0;
        int len = nums.length;
        if(len == 1)
            return 1;
        int left = 0, right = 1;
        for( ; right < len;right++){
            if(nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }

}
