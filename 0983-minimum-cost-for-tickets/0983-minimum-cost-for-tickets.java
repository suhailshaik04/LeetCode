class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        boolean[] isPresent = new boolean[days[days.length-1]+1];
        for(int x:days) isPresent[x]=true;
        Integer[] dp = new Integer[isPresent.length];
        return solve(isPresent,days[0],costs,dp);
    }

    private int solve(boolean[] isPresent,int day,int[] costs,Integer[] dp){
        if(day>=isPresent.length) return 0;
        if(dp[day]!=null) return dp[day];
        if(isPresent[day]){
           int a = costs[0] + solve(isPresent,day+1,costs,dp);
           int b = costs[1] + solve(isPresent,day+7,costs,dp);
           int c = costs[2] + solve(isPresent,day+30,costs,dp);
           return dp[day] = Math.min(a,Math.min(b,c));
        }
        else return dp[day] = solve(isPresent,day+1,costs,dp);
    }
}