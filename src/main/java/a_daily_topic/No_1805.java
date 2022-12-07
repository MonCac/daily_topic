package a_daily_topic;

// 字符串中不同蒸熟的数目

import java.util.HashSet;
import java.util.Set;

public class No_1805 {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) <= '9') {
                int j = i;
                while (j < word.length() && word.charAt(j) <= '9') {
                    j++;
                }
                while (i < j && word.charAt(i) == '0') {
                    i++;
                }
                set.add(word.substring(i, j));
                i = j;
            }
        }
        return set.size();
    }
}
