package leetbooks.primary_algorithms;

// 加一

public class No_01_007 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len - 1; i >= 0; i--){
            if(digits[i] == 9)
                digits[i] = 0;
            else {
                digits[i]++;
                return digits;
            }
        }

        int[] ans = new int[len + 1];
        ans[0] = 1;
        return ans;
    }
}
