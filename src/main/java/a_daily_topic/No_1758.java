package a_daily_topic;

// 生成交替二进制字符串的最少操作数

public class No_1758 {
    public static void main(String[] args){
        String s = "0100";
        minOperations(s);
    }
    public static int minOperations(String s) {
        int l = 0,r = 0;
        for(int i = 0; i < s.length(); i++){
            int ans = i % 2;
            if (ans == 0){
                if (s.charAt(i) == '0'){
                    l++;
                }
                else {
                    r++;
                }
            }
            else {
                if (s.charAt(i) == '1'){
                    l++;
                }
                else{
                    r++;
                }
            }
        }
        return Math.max(l, r);
    }
}
