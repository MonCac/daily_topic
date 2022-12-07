package a_daily_topic;

// 解析布尔表达式

import java.util.Stack;

public class No_1106 {
    public static void main(String[] args){
        String a = "&(|(f))";
        boolean b = parseBoolExpr(a);
    }
    public static boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i) != ')'){
                stack.push(expression.charAt(i));
            }
            else{
                StringBuilder sb = new StringBuilder();
                char a = stack.pop();
                while (a != '('){
                    sb.append(a);
                    a = stack.pop();
                }
                a = stack.pop();
                switch (a){
                    case '|':
                        if (sb.toString().contains("t"))
                            stack.push('t');
                        else
                            stack.push('f');
                        break;
                    case '&':
                        if (sb.toString().contains("f"))
                            stack.push('f');
                        else
                            stack.push('t');
                        break;
                    case '!':
                        if(sb.toString().equals("f"))
                            stack.push('t');
                        else
                            stack.push('f');
                        break;
                }
            }
        }
        return stack.pop().equals('t');
    }
}
