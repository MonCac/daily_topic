public class No_0062 {
    public int uniquePaths(int m, int n) {
        int[] res = new int[m];
        for(int i = 0;i < m;i++)
            res[i] = 1;
        for(int i = 1;i < n;i++)
            for(int j = 1;j < m;j++){
                res[j] = res[j] + res[j-1];
            }
        return res[m-1];
    }
}
