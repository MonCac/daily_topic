package a_daily_topic;

import java.util.HashMap;
import java.util.Map;

public class No_1742 {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int i = lowLimit; i <= highLimit; i++){
            int box = 0, x = i;
            while (x != 0){
                box += x % 10;
                x /= 10;
            }
            map.put(box,map.getOrDefault(box,0) + 1);
            res = Math.max(res,map.get(box));
        }
        return res;
    }
}
