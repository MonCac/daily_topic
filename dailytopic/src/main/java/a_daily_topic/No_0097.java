public class No_0097 {
    public static boolean isInterleave(String s1, String s2, String s3) {
        int length1 = s1.length();
        int length2 = s2.length();
        int length3 = s3.length();
        if (length1 + length2 != length3)
            return false;
        boolean[][] dp = new boolean[length1+1][length2+1];
        dp[0][0] = true;
        for(int i = 1;i < length1 + 1;i++){
            if (s1.charAt(i-1) == s3.charAt(i-1))
                dp[i][0] = true;
            else
                break;
        }
        for(int i = 1;i < length2 + 1;i++){
            if (s2.charAt(i-1) == s3.charAt(i-1))
                dp[0][i] = true;
            else
                break;
        }
        for(int i = 1;i < length1 + 1;i++)
            for(int j =1;j < length2 + 1;j++){
                if((s1.charAt(i-1) == s3.charAt(i+j-1) && dp[i-1][j]) || (s2.charAt(j-1) == s3.charAt(i+j-1) && dp[i][j-1]))
                    dp[i][j] = true;
            }
        return dp[length1][length2];
    }
    public  static void main(String []args){
        String s1 = "db";
        String s2 = "b";
        String s3 = "cbb";
        boolean m = true;
        m = isInterleave(s1,s2,s3);
        System.out.println(m);
    }


}
