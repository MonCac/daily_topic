package a_daily_topic;

// 子域名访问计数

import java.util.*;

public class No_0811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        int len = cpdomains.length;
        List<String> ans = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            int num = getNum(cpdomain);
            int sublen = cpdomain.length();
            int j = sublen - 1;
            StringBuilder sb = new StringBuilder();
            while (true) {
                if (cpdomain.charAt(j) == '.') {
                    map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + num);
                }
                sb.insert(0, cpdomain.charAt(j--));
                if (cpdomain.charAt(j) == ' ') {
                    map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + num);
                    break;
                }
            }

        }
        Set<String> set = map.keySet();
        for (String str : set){
            ans.add(map.get(str).toString() + ' ' +str );
        }
        return ans;
    }

    public int getNum(String a){
        int len = a.length();
        int ans = 0;
        for(int i = 0; i < len; i++){
            if(a.charAt(i) == ' ')
                return ans;
            ans = ans * 10 + a.charAt(i) - '0';
        }
        return ans;
    }
}
