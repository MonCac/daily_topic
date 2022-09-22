public class No_0011 {
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int ans = 0;
        while(end > start){
            ans = Math.max(ans,Math.min(height[start],height[end]) * (end - start));
            if(height[start] > height[end])
                end--;
            else
                start++;
        }
        return ans;
    }
}
