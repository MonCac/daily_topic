package a_daily_topic;

// 卡车上的最大单元数

import java.util.Arrays;

public class No_1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> b[1] - a[1]);
        int ans = 0;
        for (int[] boxType : boxTypes) {
            if (truckSize >= boxType[0]) {
                truckSize -= boxType[0];
                ans += boxType[0] * boxType[1];
            } else {
                ans += boxType[1] * truckSize;
            }
        }
        return ans;
    }
}
