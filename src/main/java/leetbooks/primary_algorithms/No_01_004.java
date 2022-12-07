package leetbooks.primary_algorithms;

// 存在重复元素

import java.util.HashSet;
import java.util.Set;

public class No_01_004 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
