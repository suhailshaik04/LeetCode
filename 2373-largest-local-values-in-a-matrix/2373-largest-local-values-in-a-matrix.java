class Solution {
    public int[][] largestLocal(int[][] grid) {
    int n = grid.length;
        int[][] mL = new int[n-2][n-2]; 
         for (int i = 0; i < mL.length; ++i) {
            for (int j = 0; j < mL.length; ++j) {
			
                int max = Integer.MIN_VALUE;
                for (int row = i; row <=i+2;row++) {
                    for (int column = j; column <=j +2;column++) {
                        max = Math.max(grid[row][column],max);
                    }
                }
                mL[i][j] = max;
            }
        }
        return mL;
    }
}