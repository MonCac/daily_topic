package a_daily_topic;

// 和至少为K的最短子数组

import java.util.PriorityQueue;
import java.util.Queue;

public class No_0862 {
    public int shortestSubarray(int[] nums, int k) {
        int ans=(int)1e6;
        Queue<long[]> q=new PriorityQueue<>((a, b)->a[0]<b[0]?-1:1);
        q.add(new long[]{0,-1});//[前缀和，下标]
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            long target=sum-k;
            while(!q.isEmpty()&&q.peek()[0]<=target){ans=Math.min(ans,i-(int)q.poll()[1]);}
            q.add(new long[]{sum,i});
        }
        return ans<=nums.length?ans:-1;
    }
}
