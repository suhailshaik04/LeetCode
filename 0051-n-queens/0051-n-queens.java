class Solution {
    public List<List<String>> solveNQueens(int n) {
        String board[][]=new String[n][n];
        boolean cols[]=new boolean[n];
        boolean diag[]=new boolean[2*n-1];
        boolean revdiag[]=new boolean[2*n-1];
        List<String> li=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        func(board,0,cols,diag,revdiag,li,"",ans);
        return ans;
    }
    public static void func(String[][] board,int row,boolean[] cols,boolean[] diag,boolean []revdiag,List<String> li,String psf,List<List<String>> ans){
        if(row==board.length){
            li=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String psf1="";
                for(int j=0;j<board.length;j++){
                    if(board[i][j]==null) psf1+=".";
                    else{
                    psf1+=board[i][j];
                }
                }
                System.out.println(psf1);
                li.add(psf1);
                
            }
            ans.add(li);
            return;
        }

        for(int col=0;col<board.length;col++){
            if(cols[col]==false && diag[row+col]==false && revdiag[row-col+board.length-1]==false){
                board[row][col]="Q";
                cols[col]=true;
                diag[row+col]=true;
                revdiag[row-col+(board.length)-1]=true;
                func(board,row+1,cols,diag,revdiag,li,psf,ans);
                board[row][col]=".";
                cols[col]=false;
                diag[row+col]=false;
                revdiag[row-col+(board.length)-1]=false;
            }
        }


    }
}