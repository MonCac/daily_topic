package a_daily_topic;

// 设计Goal解析器

public class No_1678 {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int len = command.length();
        for(int i = 0; i < len; i++){
            char a = command.charAt(i);
            if(a == 'G') {
                sb.append(a);
                continue;
            }
            if(a == '(' ) {
                if(command.charAt(i + 1) == ')') {
                    sb.append('o');
                    i++;
                }
                else{
                    sb.append("al");
                    i = i + 3;
                }
            }
        }
        return sb.toString();
    }
}
