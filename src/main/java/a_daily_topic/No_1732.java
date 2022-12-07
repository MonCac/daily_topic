package a_daily_topic;

// 找到最高海拔

public class No_1732 {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        ans = Math.max(ans,gain[0]);
        for(int i = 1; i < gain.length; i++){
            gain[i] = gain[i - 1] + gain[i];
            ans = Math.max(gain[i],ans);
        }
        return ans;
    }
}
