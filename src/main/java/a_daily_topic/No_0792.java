package a_daily_topic;

// 匹配子序列的单词数

import java.util.*;

public class No_0792 {
    public static void main(String[] args){
        String s = "dsahjpjauf";
        String[] words = new String[]{"ahjjpau","ja","ahbwzgqnuk","tnmlanowax"};
        int a = numMatchingSubseq(s,words);
    }
    public static int numMatchingSubseq(String s, String[] words) {
        Map<Character, List<Integer>> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++){
            List<Integer> list = map.getOrDefault(s.charAt(i),new ArrayList<>());
            list.add(i);
            map.put(s.charAt(i),list);
        }
        for(String w : words){
            boolean ok = true;
            int m = w.length(), idx = -1;
            for (int i = 0; i < m && ok; i++){
                List<Integer> list = map.getOrDefault(w.charAt(i),new ArrayList<>());
                int l = 0, r = list.size() - 1;
                while(l < r){
                    int mid = l + r >> 1;
                    if(list.get(mid) > idx) r = mid;
                    else l = mid + 1;
                }
                if(r < 0 || list.get(r) <= idx) ok = false;
                else idx = list.get(r);
            }
            if (ok)
                ans++;
        }
        return ans;
    }
}
