package leetbooks.primary_algorithms;

// 验证回文串

public class No_02_005 {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int start = 0;
        int end = len - 1;
        while (start < end){
            while (start < end && !Character.isLetterOrDigit(s.charAt(start)))
                start++;
            while (start < end &&!Character.isLetterOrDigit(s.charAt(end)))
                end--;
            if(start < end) {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                    return false;
                }
            start++;
            end--;
        }
        return true;
    }
}
