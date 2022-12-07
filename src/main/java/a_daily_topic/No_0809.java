package a_daily_topic;

// 情感丰富的文字

public class No_0809 {

    public static void main(String[] args){
        String s = "heeellooo";
        String[] words = new String[]{"heeelloooworld"};
        expressiveWords(s,words);
    }

    public static int expressiveWords(String s, String[] words) {
        int ans = 0;
        for (String word : words){
            if (similarWords(s,word)){
                ans++;
            }
        }
        return ans;
    }

    public static boolean similarWords(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int j = 0;
        for (int i = 0 ; i < len1; i++){
            if (j == len2){
                return false;
            }
            int a = 0, b = 0;
            if (s1.charAt(i) != s2.charAt(j)) {
                return false;
            }
            if (i < len1 - 1){
                while (s1.charAt(i) == s1.charAt(i + 1)) {
                    a++;
                    i++;
                    if (i == len1 - 1) {
                        break;
                    }
                }
            }
            if (j < len2 - 1){
                while (s2.charAt(j) == s2.charAt(j + 1)){
                    b++;
                    j++;
                    if (j == len2 - 1) {
                        break;
                    }
                }
            }
                j++;
            if (a == b) {
                continue;
            }
            if (a < 2|| a < b) {
                return false;
            }
        }
        if (j != len2) {
            return false;
        }
        return true;
    }
}
