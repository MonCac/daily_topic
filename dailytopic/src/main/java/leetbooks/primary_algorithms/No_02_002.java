package leetbooks.primary_algorithms;

// 整数反转

public class No_02_002 {
    public int reverse(int x) {
        long reverse = 0;
        while (x != 0){
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
            return 0;
        return (int)reverse;
    }
}
