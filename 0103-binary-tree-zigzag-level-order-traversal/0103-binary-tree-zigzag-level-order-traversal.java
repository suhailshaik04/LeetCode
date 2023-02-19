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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return list;
        zigzagLevelOrder(root, 0);
        return list;
    }
    public void zigzagLevelOrder(TreeNode root, int level) {
        if(root == null){
            return;
        }
        if(level >= list.size()){
            List<Integer> subList = new ArrayList<>();
            list.add(subList);
        }
        if(level%2==0) list.get(level).add(root.val);
        else list.get(level).add(0, root.val);
        zigzagLevelOrder(root.left, level+1);
        zigzagLevelOrder(root.right, level+1);
    }
}