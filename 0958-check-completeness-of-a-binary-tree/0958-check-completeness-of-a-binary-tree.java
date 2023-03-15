/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // Count number of nodes
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return (1 + countNodes(root.left) + countNodes(root.right));
    }
    
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        int c = countNodes(root);
        return check(root, 0, c);
    }
    public boolean check(TreeNode root, int i, int c) {
        if (root == null) return true;
        if (i >= c) return false;
        return (check(root.left, 2 * i + 1, c) && check(root.right, 2 * i + 2, c));
    }
}