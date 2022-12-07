public class No_0007 {
    public static void main(String[] args){
        double x = 1e9;
        System.out.println(x - 10);
    }
    public static int reverse(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int len = chars.length;
        long res = 0;
        if(x >= 0) {
            for (int i = len - 1; i > -1; i--) {
                res = res * 10 + chars[i] - '0';
            }
        }
        else{
            for(int i = len - 1;i > 0;i--){
                res = res * 10 + chars[i] - '0';
            }
            res = -res;
        }
        if(res > Math.pow(2,31) - 1 || res < -Math.pow(2,31))
            return 0;
        else
            return (int)res;
    }
}
