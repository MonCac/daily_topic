package a_daily_topic;

// 交替合并字符串

public class No_1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int a = 0, b = 0;
        int big = Math.max(word1.length(),word2.length());
        for(int i = 0; i < big; i++){
            if(a < word1.length()){
                sb.append(word1.charAt(i));
                a++;
            }
            if(b < word2.length()){
                sb.append(word2.charAt(i));
                b++;
            }
        }
        return sb.toString();
    }
}
