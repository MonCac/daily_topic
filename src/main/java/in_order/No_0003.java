import java.util.HashSet;
import java.util.Set;

public class No_0003 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        int ans = 0;
        int rk = -1;
        for(int i = 0;i < n;i++){
            if(i != 0){
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))){
                occ.add(s.charAt(rk + 1));
                rk++;
            }
            ans = Math.max(ans,rk + 1 - i);
        }
        return 0;
    }
}
