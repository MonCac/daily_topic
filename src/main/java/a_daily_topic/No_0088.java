package a_daily_topic;

/**
 * @author dair
 */
public class No_0088 {
    public static void main(String []args){
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3,n = 3;
        int[] nums2 = new int[]{2,5,6};
        merge(nums1,m,nums2,n);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        while(n > 0){
            if(nums1[m-1] <nums2[n-1]){
                nums1[last--] = nums2[--n];
            }
            else{
                nums1[last--] = nums1[--m];
            }
        }
    }
}
