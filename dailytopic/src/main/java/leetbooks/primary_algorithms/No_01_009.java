package leetbooks.primary_algorithms;

// 两数之和

import java.util.HashMap;
import java.util.Map;

public class No_01_009 {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
