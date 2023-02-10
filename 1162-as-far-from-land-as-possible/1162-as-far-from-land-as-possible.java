class pair{
    int x;
    int y;
    pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int maxDistance(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int level = 0;
        Queue<pair> q = new LinkedList<pair>();
        for(int row = 0; row<rows ;row++){
            for(int col = 0;col<cols;col++){
                if(grid[row][col]==1){
                    visited[row][col] = true;
                    q.add(new pair(row,col));
                }
            }
        }
        if(q.isEmpty()) return -1;
        if(q.size()==rows*cols) return -1;
        while(!q.isEmpty()){
            int  size = q.size();
            for(int ind = 0; ind<size ; ind++){
                pair p = q.poll();
                if(p.x>0 && !visited[p.x-1][p.y]){
                    visited[p.x-1][p.y] = true;
                    q.add(new pair(p.x-1,p.y));
                }
                if(p.y>0 && !visited[p.x][p.y-1]){
                    visited[p.x][p.y-1] = true;
                    q.add(new pair(p.x,p.y-1));
                }
                if(p.x<rows-1 && !visited[p.x+1][p.y]){
                    visited[p.x+1][p.y] = true;
                    q.add(new pair(p.x+1,p.y));
                }
                if(p.y<cols-1 && !visited[p.x][p.y+1]){
                    visited[p.x][p.y+1] = true;
                    q.add(new pair(p.x,p.y+1));
                }
            }
            level++;
        }
        return level-1;
        
    }
}