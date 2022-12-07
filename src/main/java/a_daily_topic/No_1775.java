package a_daily_topic;

// 通过最少操作次数使数组的和相等

import java.util.HashMap;
import java.util.Map;

public class No_1775 {
    public static void main(String[] args){
        int[] nums1 = new int[]{5,6,4,3,1,2};
        int[] nums2 = new int[]{6,3,3,1,4,5,3,4,1,3,4};
        minOperations(nums1,nums2);
    }
    public static int minOperations(int[] nums1, int[] nums2) {
        int ans = 0;
        int sum1 = 0, sum2 = 0, sum3 = 0;
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int j : nums1) {
            map1.put(j, map1.getOrDefault(j,0) + 1);
            sum1 += j;
        }
        for (int j : nums2){
            map2.put(j, map2.getOrDefault(j,0) + 1);
            sum2 += j;
        }
        sum3 = sum1 - sum2;
        if (sum3 == 0){
            return 0;
        }
        if (sum3 < 0){
            for (int i = 1; i < 6; i++){
                while (map1.getOrDefault(i,0) != 0){
                    sum3 += 6 - i;
                    map1.put(i,map1.get(i) - 1);
                    ans++;
                    if (sum3 >= 0) {
                        return ans;
                    }
                }
                while (map2.getOrDefault(7 - i, 0)!= 0){
                    sum3 += 6 - i;
                    map2.put(7 - i,map2.get(7 - i) - 1);
                    ans++;
                    if (sum3 >= 0) {
                        return ans;
                    }
                }
            }
            return -1;
        }

        for (int i = 6; i > 1; i--){
            while (map1.getOrDefault(i,0) != 0){
                sum3 -= i - 1;
                map1.put(i,map1.get(i) - 1);
                ans++;
                if (sum3 <= 0) {
                    return ans;
                }
            }
            while (map2.getOrDefault(7 - i, 0)!= 0){
                sum3 -= i - 1;
                map2.put(7 - i,map2.get(7 - i) - 1);
                ans++;
                if (sum3 <= 0) {
                    return ans;
                }
            }
        }
        return -1;
    }
}
