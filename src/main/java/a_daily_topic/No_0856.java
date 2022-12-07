package a_daily_topic;

// 括号的分数

import java.util.Stack;

public class No_0856 {
    public static void main(String[] args){
        int a = 2;
        int ans = 1 << a;
        System.out.println(ans);
    }
    public int scoreOfParentheses(String s) {
        int len = s.length();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == '(')
                stack.push(0);
            else{
                int v = stack.pop();
                int ans = stack.pop() + Math.max(2 * v, 1);
                stack.push(ans);
            }
        }
        return stack.peek();
    }
}
