package a_daily_topic;

// 神奇字符串

public class No_0481 {
    public static void main(String[] args){
        int a = magicalString(6);
    }
    public static int magicalString(int n) {
        int[] a = new int[n+3];
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        a[0] = 1;
        a[1] = 2;
        int i = 0, j = 0, flag = 1, ans = 0;
        while (j < n + 1){
            if(a[i] == 1){
                if(flag == 1)
                    a[j++] = 1;
                else
                    a[j++] = 2;
            }
            else{
                if(flag == 1){
                    a[j] = 1;
                    a[j + 1] = 1;
                    j = j + 2;
                }
                else{
                    a[j] = 2;
                    a[j + 1] = 2;
                    j = j + 2;
                }
            }
            flag = -flag;
            i++;
        }
        for(i = 0; i < n; i++)
            if (a[i] == 1)
                ans++;
       return ans;
    }
}
