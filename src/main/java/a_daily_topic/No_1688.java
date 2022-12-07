package a_daily_topic;

// 最大重复子字符串

public class No_1688 {
    public int maxRepeating1(String sequence, String word) {
        int ans = 0,cur = 0;
        int i = 0, len = word.length();
        String subsequence = null;
        while (i + len <= sequence.length()){
            subsequence = sequence.substring(i,i + len);
            if(subsequence.equals(word)) {
                cur++;
                i = i + len - 1;
            }
            ans = Math.max(ans,cur);
            if(!subsequence.equals(word)) {
                if(cur != 0)
                    i = i - len + 1;
                cur = 0;
            }
            i++;
        }
        return ans;
    }

    public int maxRepeating2(String sequence, String word) {
        int ans = 0;
        String tmp = word;
        while (sequence.contains(tmp)){
            ans++;
            tmp+= word;
        }
        return ans;
    }
}
