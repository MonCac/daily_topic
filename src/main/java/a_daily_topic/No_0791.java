package a_daily_topic;

// 自定义字符串排序

public class No_0791 {
    public String customSortString(String order, String s) {
    int[] cnts = new int[26];
    for(char c : s.toCharArray()){
        cnts[c - 'a']++;
    }
    StringBuilder sb = new StringBuilder();
    for(char c : order.toCharArray()){
        while (cnts[c - 'a']-- > 0){
            sb.append(c);
        }
    }
    for(int i = 0; i < 26; i++){
        while (cnts[i]-- > 0)
            sb.append((char)(i + 'a'));
    }
    return sb.toString();
}

}
