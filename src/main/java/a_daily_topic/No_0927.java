package a_daily_topic;

// 三等分

public class No_0927 {
    public int[] threeEqualParts(int[] arr) {
        int len = arr.length;
        int sum = 0;
        for (int j : arr) sum += j;
        if(sum == 0)
            return new int[]{0,2};
        if(sum %3 != 0)
            return new int[]{-1,-1};
        sum /= 3;
        int r = len - 1, l = 0;
        while (arr[r] == 0)
            r--;
        int end = r;
        int zero = arr.length - 1 - r;
        int count = 0;
        while (count < sum){
            count += arr[l];
            l++;
        }
        r = l;
        while (count < sum * 2){
            count += arr[r];
            r++;
        }
        for(int i = l; i < l + zero; i++){
            if(arr[i] == 1)
                return new int[]{-1,-1};
        }
        for(int i = r; i < r + zero; i++){
            if(arr[i] == 1)
                return new int[]{-1,-1};
        }
        count = 0;
        for(int i = 0; count < sum; i++){
            if(arr[end - i] != arr[l - 1 - i] || arr[end - i] != arr[r - 1 - i])
                return new int[]{-1,-1};
            count += arr[end - i];
        }
        return new int[]{l + zero - 1, r + zero};
    }
}
