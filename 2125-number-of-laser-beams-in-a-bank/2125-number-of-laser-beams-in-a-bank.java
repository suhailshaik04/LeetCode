class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int n = bank.length;
        int[] cnt = new int[n];
        for (int i = 0; i < n; ++i) {
            int idx = bank[i].indexOf('1');
            while (idx != -1 && idx < bank[i].length()) {
                idx = bank[i].indexOf('1', idx + 1);
                cnt[i]++;
            }
        }
        int j = 0;
        for (int i = 1; i < n && j < n; ++i) {
            if (cnt[i] != 0 && cnt[j] != 0) {
                ans += cnt[i] * cnt[j];
                j++;
            }
             while (cnt[j] == 0 && j < i) j++;
        }
        
        return ans;
    }
}