package a_daily_topic;

// 两个相同字符之间的最长子字符串

import java.util.HashMap;
import java.util.Map;

public class No_1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int len = s.length();
        int ans = -1;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),i);
            else{
                int a = i - map.get(s.charAt(i));
                ans = Math.max(ans, a - 1);
            }

        }
        return ans;
    }
}
