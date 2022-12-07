package a_daily_topic;

// 在LR字符串中交换相邻字符

public class No_0777 {
    public boolean canTransform(String start, String end) {
        if(start.length() != end.length())
            return false;
        int len = start.length();
        int i = 0, j = 0;
        while (i < len && j < len){
            while (i < len && start.charAt(i) == 'X')
                i++;
            while (j < len && end.charAt(j) == 'X')
                j++;
            if(i >= len || j >= len)
                break;
            if(start.charAt(i) != end.charAt(j))
                return false;
            if(start.charAt(i) == 'R' && i > j)
                return false;
            if(start.charAt(i) == 'L' && i < j)
                return false;
            i++;
            j++;
        }
        while (i != len){
            if(start.charAt(i) != 'X')
                return false;
            i++;
        }
        while (j != len){
            if(end.charAt(j) != 'X')
                return false;
            j++;
        }
        return true;
    }
}
