package a_daily_topic;

// 可能的二分法

public class No_0886 {
    int[] p = new int[4010];
    int find(int x) {
        if (p[x] != x) p[x] = find(p[x]);
        return p[x];
    }
    void union(int a, int b) {
        p[find(a)] = p[find(b)];
    }
    boolean query(int a, int b) {
        return find(a) == find(b);
    }
    public boolean possibleBipartition(int n, int[][] ds) {
        for (int i = 1; i <= 2 * n; i++) p[i] = i;
        for (int[] info : ds) {
            int a = info[0], b = info[1];
            if (query(a, b)) return false;
            union(a, b + n); union(b, a + n);
        }
        return true;
    }
}
