package a_daily_topic;

//  仅执行一次字符串交换能否使两个字符串相等

public class No_1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        int a = -1, b = -1;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if (a == -1) {
                    a = i;
                    continue;
                }
                if (a != -1 && b == -1){
                    b = i;
                }
                else
                    return false;
            }
        }
        if(a != -1 && b != -1){
            if(s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a))
                return true;
        }
        return s1.equals(s2);
    }
}
