package a_daily_topic;

// 最大交换

public class No_0670 {
    public static void main(String[] args){
        int a = 98368;
        System.out.println(maximumSwap(a));
    }
    public static int maximumSwap(int num) {
        char[] cr = String.valueOf(num).toCharArray();
        int len = cr.length;
        for(int i = 0; i < len; i++){
            int maxidx = i;
            for(int j = len - 1; j > i; j--){
                if(cr[maxidx] < cr[j])
                    maxidx = j;
            }
            if(maxidx != i){
                char temp = cr[i];
                cr[i] = cr[maxidx];
                cr[maxidx] = temp;
                return Integer.parseInt(new String(cr));
            }
        }
        return num;
    }
}
