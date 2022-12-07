package a_daily_topic;

// 拆炸弹

import java.util.Map;

public class No_1652 {
    public static void main(String[] args){
        int[] code = new int[]{5,7,1,4};
        int k = -2;
        int[] ans = decrypt(code,k);
    }
    public static int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] ans = new int[len];
        for(int i = 0; i < len; i++){
            int m = 0;
            if(k > 0){
                for(int j = 1; j <= k; j++){
                    int n = (i + j) % len;
                    m += code[n];
                }
            }
            if(k < 0){
                for(int j = 1; j <= Math.abs(k); j++){
                    int n = (i - j) % len;
                    m += code[n];
                }
            }
            ans[i] = m;
        }
        return ans;
    }
}
