package a_daily_topic;

// 判断字符串的两半是否相似

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class No_1704 {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);
        String h = "aeiouAEIOU";
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < a.length(); i++) {
            if (h.indexOf(a.charAt(i)) >= 0) {
                sum1++;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (h.indexOf(b.charAt(i)) >= 0) {
                sum1--;
            }
        }
        return sum1 == 0;
    }
}
