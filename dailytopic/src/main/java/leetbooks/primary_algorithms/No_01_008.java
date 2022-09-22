package leetbooks.primary_algorithms;

// 移动零

public class No_01_008 {
    public static void main(String[] args){
        int[] nums = new int[]{1};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int a = 0,b = 0;
        while (nums[b] != 0) {
            b++;
            if(b == len)
                break;
        }
        for(int i = 0; i < len; i++){
            if(i > b && nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[b];
                nums[b] = temp;
                while (nums[b] != 0) {
                    b++;
                    if(b == len)
                        break;
                }
            }

        }
    }
}
