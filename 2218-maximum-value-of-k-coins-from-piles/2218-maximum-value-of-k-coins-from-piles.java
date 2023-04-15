class Solution {
    private Integer dp[][];
    private int helper(List<List<Integer>> piles, int currentPile, int coinsLeft){
        if(currentPile<0 || coinsLeft == 0)
            return 0;
        if(dp[currentPile][coinsLeft]!=null)
            return dp[currentPile][coinsLeft];

        int coinsPickLimit = Math.min(coinsLeft, piles.get(currentPile).size());
        int excludeCurrentPile = helper(piles, currentPile-1, coinsLeft);
        
        int includeCurentPile=0;
        for(int j=0, sum=0; j<coinsPickLimit ; j++){
            sum+= piles.get(currentPile).get(j);
            includeCurentPile = Math.max(sum + helper(piles, currentPile-1, coinsLeft-(j+1)), includeCurentPile);
        }
        
        int res = Math.max(includeCurentPile, excludeCurrentPile);
        dp[currentPile][coinsLeft] = res;
        return res;

    } 

    public int maxValueOfCoins(List<List<Integer>> piles, int K) {
        int n = piles.size();
        dp = new Integer[n + 1][K + 1];
        return helper(piles, n-1, K);
    }
}