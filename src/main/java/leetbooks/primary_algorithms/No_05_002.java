package leetbooks.primary_algorithms;

// 第一个错误的版本

public class No_05_002 {

    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end){
            int mid = (start + end) / 2;
            if(!isBadVersion(mid))
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }

    boolean isBadVersion(int n ){
        return false;
    }
}
