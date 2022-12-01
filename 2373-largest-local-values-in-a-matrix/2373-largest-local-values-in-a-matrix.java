class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int [][] mL = new int[n-2][n-2];
        int max;
        for(int i=0;i<mL.length;i++){
            for(int j=0;j<mL.length;j++){
                max = grid[i][j];
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        if(grid[k][l] > max) max = grid[k][l];
                }
            }
                mL[i][j] = max;
            }
        }
        return mL;
    }
}