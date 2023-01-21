class Solution {
    int[][] grid;
    int[] balls;
    int ROW, COL;
    public int[] findBall(int[][] grid) {
        this.balls = new int[grid[0].length];
        Arrays.fill(balls, -1);
        this.grid = grid;
        ROW = grid.length;
        COL = grid[0].length;
        for(int ball=0; ball<balls.length; ball++){
            dfs(0, ball, ball);
        }
        return balls;
    }
    private void dfs(int i, int j, int ballNo){
        if(balls[ballNo]>-1)
            return;
        if(i==ROW){
            balls[ballNo] = j;
            return;
        }
        if(isBound(i,j)){
            if(grid[i][j]==1 && j<COL-1 && grid[i][j]==grid[i][j+1]){
                dfs(i+1, j+1, ballNo);
            }
            else if(grid[i][j]==-1 && j>0 && grid[i][j]==grid[i][j-1])
                dfs(i+1, j-1, ballNo);
        }
    }
    
    private boolean isBound(int i, int j){
        return (i>=0 && i<ROW && j>=0 && j<COL);
    }
}