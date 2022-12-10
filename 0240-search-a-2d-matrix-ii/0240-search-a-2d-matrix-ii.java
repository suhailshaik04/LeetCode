class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target) return true;
            }
        }
        return false;
        */
        /*If we stand on the top-right corner of the matrix and look diagonally, it's kind of like a BST, we can go through this matrix to find the target like how we traverse the BST.
                                                        or
        We start search the matrix from top right corner, initialize the current position to top right corner, if the target is greater than the value in current position, then the target can not be in entire row of current position because the row is sorted, if the target is less than the value in current position, then the target can not in the entire column because the column is sorted too. We can rule out one row or one column each time, so the time complexity is O(m+n).*/
        
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            int num = matrix[row][col];
            if(target == num ) {
                return true;
            } else if(target < num) {
                col--;
            } else if(target > num) {
                row++;
            }
        }
        return false;
    }
}