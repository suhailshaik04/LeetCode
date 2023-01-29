class Solution {
   public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        dfs(1, n, res);
        return res;
    }

    private void dfs(int currentNumber, int n, List<Integer> res) {
        if (currentNumber > n) {
            return;
        }
        res.add(currentNumber);
        dfs(currentNumber * 10, n, res);
        if ((currentNumber + 1) % 10 == 0)
            return;
        dfs(currentNumber + 1, n, res);
    }
}