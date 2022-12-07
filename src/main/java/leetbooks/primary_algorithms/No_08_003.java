package leetbooks.primary_algorithms;

// 3的幂

public class No_08_003 {
    public boolean isPowerOfThree(int n) {
        while (n > 2){
            if(n % 3 != 0)
                return false;
            n /= 3;
        }
        return n == 1;
    }
}
