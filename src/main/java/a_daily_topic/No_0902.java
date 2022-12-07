package a_daily_topic;

// 最大为N的数字集合

public class No_0902 {
    public static void main(String[] ars){
        String[] a = new String[]{"1","7"};
        int n = 231;
        int b = atMostNGivenDigitSet(a,n);
        System.out.println(b);
    }
    public static int atMostNGivenDigitSet(String[] digits, int n) {
        int ans = 0;
        String a = Integer.toString(n);
        int len = a.length();
        for(int i = 1; i < len; i++){
            ans = ans + (int) Math.pow(digits.length,i);
        }
        for(int i = 0; i < len; i++){
            int j = -1;
            while (a.charAt(i) >= digits[j + 1].charAt(0)) {
                j++;
                if(j == digits.length - 1)
                    break;
            }
            if(j == -1)
                return ans;
            double pow = Math.pow(digits.length, len - i - 1);
            if(a.charAt(i) > digits[j].charAt(0)){
                ans  = ans + (j + 1) * (int) pow;
                return ans;
            }
            ans = ans + j * (int) pow;
            if(i == len - 1)
                ans = ans + 1;
        }
        return ans;

    }
}
