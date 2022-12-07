import java.util.Arrays;

public class No_1608 {
    public int specialArray(int[] nums) {
        Arrays.sort(nums); // 进行的是升序排列
        int n = nums.length;
        for(int i = 0, j = n - 1; i < j; i++, j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for(int i = 1; i <= n; i++)
            if(nums[i-1] >= i && (i == n || nums[i] < i))
                return i;
        return -1;
    }
}
