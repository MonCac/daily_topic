package leetbooks.primary_algorithms;

// 两个数组的交集

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 两个数组的交集

public class No_01_006 {

    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        int[] nums3 = intersect(nums1,nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int j : nums1) {
            if (!map.containsKey(j))
                map.put(j, 1);
            else
                map.put(j, map.get(j) + 1);
        }
        for(int i : nums2){
            if(map.containsKey(i)){
                if(map.get(i) != 1)
                    map.put(i,map.get(i) - 1);
                else
                    map.remove(i);
                list.add(i);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }

}
