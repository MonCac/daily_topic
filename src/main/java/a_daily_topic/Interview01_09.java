package a_daily_topic;

// 字符轮转

public class Interview01_09 {
    public boolean isFlipedString(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        int len = s1.length();
        String s3 = s1 + s1;
        return s3.contains(s2);
    }
}
