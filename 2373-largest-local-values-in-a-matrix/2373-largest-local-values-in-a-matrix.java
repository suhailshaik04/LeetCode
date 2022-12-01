class Solution {
    public int[][] largestLocal(int[][] grid) {
    int n = grid.length;
       int [][] mL = new int [n-2][n-2];
       for(int i=0; i<n-2;i++){
           for(int j=0; j<n-2;j++){
               mL[i][j]= fillMax(i,j,grid);
           }
       }
	return mL;
    }

    public static int fillMax(int i, int j, int[][] grid){
        int Max = Integer.MIN_VALUE;
        for(int a= i; a<=i+2; a++){
            for(int b= j; b<=j+2; b++){
                Max = Math.max(grid[a][b],Max);
            }
        }
        return Max;
    }
}