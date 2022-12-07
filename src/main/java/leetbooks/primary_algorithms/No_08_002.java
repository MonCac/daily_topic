package leetbooks.primary_algorithms;

// 计数质数

import java.lang.reflect.Array;
import java.util.Arrays;

public class No_08_002 {
    public int countPrimes(int n) {
        if(n == 1 || n == 0)
            return 0;
        int[] a = new int[n];
        Arrays.fill(a,1);
        int ans = 0;
        for(int i = 2; i < n; i++){
            if (a[i] == 1) {
                ans++;
                if((long) i * i < n){
                    for(int j = i * i; j < n; j += i){
                        a[j] = 0;
                    }
                }
            }
        }
        return ans;
    }
}
