public class No_0004 {
    public static void main(String[] args){
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2,4};
        double a = findMedianSortedArrays(nums1,nums2);
    }
    public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 保证让上面的数组长度小于等于下面的数组长度
        if (nums1.length > nums2.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length;
        int n = nums2.length;

        // 分割线左边的所有元素个数为 (m + n + 1) / 2;
        int totalLeft = (m + n + 1) / 2;

        // 要在 nums1 的区间 [0,m] 里找到合适的分割线，
        // 使得 nums1[i-1] <= nums2[j] && nums2[j-1] <= nums1[i]
        int left = 0;
        int right = m;

        while(left < right){
            int i = left + (right - left + 1) / 2; // 二分查找，每次缩小一半的范围
            int j = totalLeft - i;
            if(nums1[i-1] > nums2[j]){
                // 下一轮搜索区间 [left,i - 1]
                right = i - 1;
            }else{
                // 下一轮搜索区间 [i,right]
                left = i;

            }
        }

        int i = left;
        int j = totalLeft - i;
        int nums1LeftMax = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
        int nums1RightMin = i == m ? Integer.MAX_VALUE : nums1[i];
        int nums2LeftMax = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
        int nums2RightMin = j == n ? Integer.MAX_VALUE : nums2[j];
        if ((m + n) % 2 == 1){
            return Math.max(nums1LeftMax,nums2LeftMax);
        }else{
            return (double)((Math.max(nums1LeftMax,nums2LeftMax) + Math.min(nums1RightMin,nums2RightMin))) / 2;
        }
    }
}
