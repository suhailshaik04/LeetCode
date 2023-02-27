/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
*/

class Solution {
    public Node construct(int[][] grid) {
        return construct(grid, 0,0, grid.length);
    }
    private Node construct(int[][] grid, int sr, int sc, int sz) {
        int val = hasSameValue(grid, sr,sc, sz);
        if( val != -1) return new Node((val ==1), true);
            else {
            final Node root = new Node();
            root.topLeft = construct(grid, sr, sc, sz/2);
            root.topRight = construct(grid, sr, sc+sz/2, sz/2);
            root.bottomLeft = construct(grid, sr+sz/2, sc, sz/2);
            root.bottomRight = construct(grid, sr+sz/2, sc+sz/2, sz/2);
            return root;
        }
    }

    private int hasSameValue(int[][] grid, int sr, int sc, int sz) {
        for(int r=sr;r<sr+sz;r++) {
            for(int c=sc;c<sc+sz;c++) {
                if(grid[sr][sc] != grid[r][c]) return -1;
            }
        }
        return grid[sr][sc];
    }
}