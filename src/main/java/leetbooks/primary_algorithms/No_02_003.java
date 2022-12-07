package leetbooks.primary_algorithms;

// 字符串中的第一个唯一字符

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No_02_003 {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int len = s.length();
        for(int i = 0; i < len; i++){
            char cr = s.charAt(i);
            map.put(cr,map.getOrDefault(cr,0) + 1);
        }
        for(int i = 0; i < len; i++)
            if(map.get(s.charAt(i)) == 1)
                return i;
        return -1;
    }
}
