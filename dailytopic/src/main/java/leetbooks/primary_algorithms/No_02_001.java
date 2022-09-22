package leetbooks.primary_algorithms;

// 反转字符串

public class No_02_001 {
    public void reverseString(char[] s) {
        int len = s.length;
        int start = 0,end = len - 1;
        while (start < end){
            char a = s[start];
            s[start] = s[end];
            s[end] = a;
            start++;
            end--;
        }
    }
}
