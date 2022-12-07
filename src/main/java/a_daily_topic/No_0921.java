package a_daily_topic;

// 使括号有效的最少添加

public class No_0921 {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        int a = 0, b = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                a++;
            else{
                if(a == 0)
                    ans++;
                else
                    a--;
            }
        }
        return ans + a;
    }
}
