package a_daily_topic;

// 用栈操作构建数组

import java.util.ArrayList;
import java.util.List;

public class No_1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<String>();
        int prev = 0;
        for (int number : target) {
            for (int i = 0; i < number - prev - 1; i++) {
                res.add("Push");
                res.add("Pop");
            }
            res.add("Push");
            prev = number;
        }
        return res;

    }
}
