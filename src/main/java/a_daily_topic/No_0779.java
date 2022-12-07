package a_daily_topic;

import java.util.LinkedList;
import java.util.Queue;

// 第K个语法符号
public class No_0779 {
    public static void main(String[] args) {
        int n = 30;
        int k = 434991989;
        int ans = kthGrammar(n,k);
    }
    public static int kthGrammar(int n, int k) {
        int i = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while (i < n){
            for(int j = 0; j < (int)Math.pow(2,i); j++){
                int m =queue.remove();
                if(m == 0){
                    queue.add(0);
                    queue.add(1);
                }
                else{
                    queue.add(1);
                    queue.add(0);
                }
            }
            i++;
        }
        for(int j = 1; j < k; j++){
            queue.remove();
        }
        return queue.remove();
    }
}
