package in_order;

public class No_0008 {
    public static void main(String[] args){
        String s = "asd1235123";
        int a = myAtoi(s);
        System.out.println(a);
    }
    public static int myAtoi(String s) {
        if (s.length() == 0)
            return 0;
        int res = 0;
        int i = 0;
        int flag = 1;
        int any = 0;
        while(i < s.length()){
            if (any != 1) {
                if (s.charAt(i) == ' ') {
                    i++;
                    continue;
                }
                if (s.charAt(i) == '-') {
                    flag = -1;
                }
                if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                    any = 1;
                    i++;
                    continue;
                }
            }
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                any = 1;
                int r = s.charAt(i) - '0';
                if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && r > 7)){
                    return flag > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = res * 10 + r;
                i++;
                continue;
            }
            break;
        }
        return flag >0 ? res : -res;

    }
}
