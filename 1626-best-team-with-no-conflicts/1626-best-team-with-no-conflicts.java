class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        int[][] players = new int[n][2];
        for(int i=0;i<n;i++){
           players[i][0]=scores[i];
           players[i][1]=ages[i];
        }
        Arrays.sort(players, (p1,p2) -> p1[0]==p2[0]? Integer.compare(p1[1],p2[1]):Integer.compare(p1[0],p2[0]));

        int[] dp = new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            dp[i]=search(dp,players,i)+players[i][0];
            max=Math.max(max,dp[i]);
        }
        return max;
    }
    private int search(int[] dp,int[][] players,int i){
        int max=0;
        for(int j=0;j<i;j++){
            if(dp[j]>max && players[j][1]<=players[i][1]){
                max=dp[j];
            }
        }
        return max;
    }
}