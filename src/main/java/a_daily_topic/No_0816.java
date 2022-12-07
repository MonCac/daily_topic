package a_daily_topic;

// 模糊坐标

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No_0816 {
    public static void main(String[] args){
        String s = "(0123)";
        List<String> list = ambiguousCoordinates(s);
        System.out.println(list);
    }
    public static List<String> ambiguousCoordinates(String s) {
        String s1 = s.substring(1,s.length() - 1);
        int len = s1.length();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < len - 1; i++){
            String a = s1.substring(0, i + 1);
            String b = s1.substring(i + 1);
            List<String> list1 = subStringCoordinates(a);
            List<String> list2 = subStringCoordinates(b);
            if(list1 == null || list2 == null)
                continue;
            for (String item : list1)
                for (String value : list2) {
                    list.add('(' + item + ",  " + value + ')');
                }
        }
        return list;
    }

    public static List<String> subStringCoordinates(String s){
        List<String> list = new ArrayList<>();
        if(s.length() == 1) {
            list.add(s);
            return list;
        }
        if(s.charAt(0) == '0'){
            if(s.charAt(s.length() - 1) == '0')
                return null;
            else{
                list.add("0." + s.substring(1,s.length()));
                return list;
            }
        }
        if(s.charAt(s.length() - 1) == '0'){
            list.add(s);
            return list;
        }
        for(int i = 0; i < s.length() - 1; i++){
            list.add(s.substring(0,i + 1) + '.' + s.substring(i + 1));
        }
        list.add(s);
        return list;
    }
}
