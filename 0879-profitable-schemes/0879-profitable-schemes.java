class Solution {

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        long[][][] dp = new long[n + 1][minProfit + 1][group.length + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= minProfit; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return (int) backtrack(n, minProfit, group, profit, 0, dp);
    }

    private long backtrack(int n, int minProfit, int[] group, int[] profit, int start, long[][][] dp) {
        int p = Math.max(minProfit, 0);
        if (dp[n][p][start] != -1) {
            return dp[n][p][start];
        }
        long res = 0;
        if (minProfit <= 0) {
            res++;
        }
        if (start == group.length) return res;
        long mod = 1_000_000_007;
        res = backtrack(n, minProfit, group, profit, start + 1, dp);
        if (n >= group[start]) {
            res = (res + backtrack(n - group[start], minProfit - profit[start], group, profit, start + 1, dp)) % mod;
        }
        return (dp[n][p][start] = res);
    }
}