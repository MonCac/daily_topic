package a_daily_topic;

// 删除某些元素后的数组均值

import java.util.Arrays;

public class No_1619 {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double ans = 0;
        for(int i = arr.length / 20; i < arr.length * 19 / 20; i++){
            ans += arr[i];
        }
        ans = ans / (arr.length * 18 / 20);
        return ans;
    }
}
