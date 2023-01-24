class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length, n = box[0].length;
        char ans[][] = new char[n][m];
        int count;
        for(int i = 0 ; i < m ; i++) {
            count = 0;
            for(int j = n - 1 ; j >= 0 ; j--) {
                if(box[i][j] == '.') {
                    count++;
                    ans[j][m - i - 1] = '.';
                }
                else if(box[i][j] == '*') {
                    count = 0;
                    ans[j][m - i - 1] = '*';
                }
                else {
                    if(count == 0)
                        ans[j][m - i - 1] = '#';
                    else {
                        ans[j][m - i - 1] = '.';
                        ans[j + count][m - i - 1] = '#';
                    }
                }      
            }
        }
        return ans;
    }
}