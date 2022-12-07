package leetbooks.primary_algorithms;

// 合并两个有序数组
public class No_05_001 {
    public static void main(String[] args){
        int[] nums1  = new int[]{2,0};
        int m = 1;
        int[] nums2 = new int[]{1};
        int n =1;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n -1;
        int p1 = m - 1;
        int p2 = n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0){
            if(p1 == -1)
                cur = nums2[p2--];
            else if (p2 == -1)
                cur = nums1[p1--];
            else if (nums1[p1] > nums2[p2])
                cur = nums1[p1--];
            else
                cur = nums2[p2--];
            nums1[last--] = cur;
        }
    }
}
