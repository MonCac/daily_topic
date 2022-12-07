package a_daily_topic;

// 水果成篮

public class No_0904 {

    public static void main(String[] args){
        int[] a = new int[]{3,3,3,1,2,1,1,2,3,3,4};
        int b = totalFruit(a);
    }

    public static int totalFruit(int[] fruits) {
        int len =  fruits.length;
        if(len == 1)
            return 1;
        int a = 0,b = 1;
        while (fruits[a] == fruits[b]){
            b++;
            if(b == len)
                return len;
        }
        a = b - 1;
        int ans = 0, sum = b;
        for(int i = b; i < len; i++){
            if(fruits[i] == fruits[a] || fruits[i] == fruits[b]){
                sum++;
                if(fruits[i] == fruits[a])
                    a = i;
                else
                    b = i;
                continue;
            }
            ans = Math.max(ans,sum);
            if(a == (i - 1)){
                sum = a - b + 1;
                b = i;
            }
            else {
                sum = b - a + 1;
                a = i;
            }
        }
        ans = Math.max(ans,sum);
        return ans;
    }
}
