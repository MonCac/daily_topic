package a_daily_topic;

import java.util.HashSet;
import java.util.Set;

// 统计一致字符串的
public class No_1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
        for(int i = 0; i < words.length; i++){
            int flag = 0;
            String s = words[i];
            for(int j = 0; j < s.length(); j++){
                if (!set.contains(s.charAt(j))) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                ans++;
        }
        return ans;
    }
}
