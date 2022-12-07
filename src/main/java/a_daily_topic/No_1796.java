package a_daily_topic;

// 字符串中第二大的数字

public class No_1796 {
    public static int secondHighest(String s) {
        int[] ans = new int[]{-1,-1};
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c >= '0' && c <= '9'){
                int a = c - '0';
                if (a > ans[0]){
                    ans[1] = ans[0];
                    ans[0] = a;
                } else if (a > ans[1] && a != ans[0]) {
                    ans[1] = a;
                }
            }
        }
        return ans[1];
    }
}
