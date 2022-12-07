package a_daily_topic;

// 重新格式化电话号码

public class No_1694 {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < number.length(); i++){
            char ch = number.charAt(i);
            if (Character.isDigit(ch))
                sb.append(ch);
        }
        int len = sb.length();
        int pt = 0;
        StringBuilder ans = new StringBuilder();
        while(len > 0){
            if(len > 4){
                ans.append(sb.subSequence(pt,pt + 3) + "-");
                pt += 3;
                len -= 3;
            }
            else{
                if(len == 4){
                    ans.append(sb.subSequence(pt, pt + 2) + "-" + sb.subSequence(pt + 2, pt + 4));
                }
                else{
                    ans.append(sb.subSequence(pt, pt + len));
                }
                break;
            }
        }
        return ans.toString();
    }
}
