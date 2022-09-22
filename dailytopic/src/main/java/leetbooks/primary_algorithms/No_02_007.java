package leetbooks.primary_algorithms;

// 实现 strStr()

public class No_02_007 {
    public int strStr(String haystack, String needle) {
        int len = haystack.length();
        int shortlen = needle.length();
        int ans = 0;
        while (ans <= len - shortlen){
            if (haystack.charAt(ans) == needle.charAt(0)) {
                for (int j = 0; j < shortlen; j++) {
                    if(haystack.charAt(ans + j) != needle.charAt(j))
                        break;
                    if(j == shortlen - 1)
                        return ans;
                }

            }
            ans++;
        }
        return -1;
    }
}
