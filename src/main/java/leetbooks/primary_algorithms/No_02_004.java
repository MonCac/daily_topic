package leetbooks.primary_algorithms;

// 有效的字母异位词

import java.util.HashMap;
import java.util.Map;

public class No_02_004{
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char crs = s.charAt(i);
            char crt = t.charAt(i);
            map.put(crs, map.getOrDefault(crs,0) + 1);
            map.put(crt, map.getOrDefault(crt,0) - 1);
        }
        for(int i = 0; i < s.length(); i++)
            if(map.get(s.charAt(i)) != 0)
                return false;
        return true;
    }

}
