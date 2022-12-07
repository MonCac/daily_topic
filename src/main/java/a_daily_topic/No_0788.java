package a_daily_topic;

// 旋转数字

import java.lang.reflect.Array;

public class No_0788 {
    int must[] = {1,1,1,0,0,1,1,0,1,1};
    int exist[] = {0,0,1,0,0,1,1,0,0,1};
    public int rotatedDigits(int n) {
        int sum = 0;
        for(int i = 1;i <= n; i++){
            if(isgood(i))
                sum++;
        }
        return sum;

    }
    boolean isgood(int n ){
        boolean ans = false;
        while (n > 0){
            int r = n % 10;
            if(must[r] == 0)
                return false;
            if(exist[r] == 1)
                ans = true;
            n /= 10;
        }
        return ans;
    }
}
