package a_daily_topic;

// 最多能完成排序的块

public class No_0769 {
    public int maxChunksToSorted(int[] arr) {
        int len = arr.length;
        int ans = 0;
        int max = 0;
        for(int i = 0;i < len; i++){
            max = Math.max(max,arr[i]);
            if(max == i)
                ans++;
        }
        return ans;
    }
}
