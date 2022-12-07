import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public class No_0857 {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Integer[] h = new Integer[n]; // Integer 才能用Arrays.sort扩展
        for(int i = 0;i < n;i++){ // 工人的身份ID 方便排序和计算
            h[i] = i;
        }
        Arrays.sort(h,(a, b)-> (quality[b] * wage[a] - quality[a] * wage[b])); // 对工人id 按照单位工作质量最低薪资进行升序排序
        double minTotal = 1e9; // 最小的k组工人雇佣金 题目最大是1e8 意思是10的8次方
        double totalq = 0.0; // k组工人的总工作质量
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->(b-a)); //用最大堆留下工作质量最小的k个人
        for(int i = 0;i < k-1;i++){
            totalq +=quality[h[i]];
            pq.offer(quality[h[i]]);
        }
        for(int i = k -1; i < n;i++){
            int idx = h[i];
            totalq += quality[idx];
            pq.offer(quality[idx]); // 累加总工作质量；最高时薪就是当前升序遍历到的，最小的工作时间就是当前最大堆内的k个人的总工作时间
            double totalc = ((double)wage[idx] / quality[idx]) * totalq; // 计算当前堆内k个人的佣金
            minTotal = Math.min(minTotal,totalc);
            totalq -= pq.poll();
        }
        return minTotal;
    }
}
