class Solution {
    public long countPairs(int n, int[][] edges) {
        long total = n * (long) (n - 1) / 2;
        if (edges.length == total) return 0;
        else if (edges.length <= 1) return total - edges.length;
        int[] parents = new int[n];
        for (int i = 1; i < n; i++) parents[i] = i;
        for (int[] pair : edges) {
            int p = find(pair[0], parents);
            int q = find(pair[1], parents);
            if (p > q) parents[p] = q;
            else if (p < q) parents[q] = p;
        }
        int[] sizes = new int[n];
        Arrays.fill(sizes, 1);
        for (int i = 0; i < n; i++) {
            int p = find(i, parents);
            if (i != p) sizes[p]++;
        }
        for (int s : sizes) {
            if (s > 1) total -= s * (long) (s - 1) / 2;
        }
        return total;
    }
    private int find(int x, int[] parents) {
        return x == parents[x] ? x : find(parents[x], parents);
    }
}