public class No_0014 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        int length = strs[0].length();
        int count = strs.length;
        for(int i = 0; i < length; i++){
            char c = strs[0].charAt(i);
            for(int j = 0; j < count; j++){
                if(i == strs[j].length() || c != strs[j].charAt(i))
                    return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}
