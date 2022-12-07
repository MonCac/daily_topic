package a_daily_topic;

// 判定是否互为字符重排

import java.util.HashMap;
import java.util.Map;

public class Interview01_02 {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        int len = s1.length();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0) + 1);
        }
        for(int i = 0; i < len; i++){
            if(map.getOrDefault(s2.charAt(i),0) < 1)
                return false;
            map.put(s2.charAt(i),map.get(s2.charAt(i)) - 1);
        }
        return true;
    }
}
