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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        if (root == null) return ans;
        Map<String, Integer> sti = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        dfs(sti, count, ans, root);
        return ans;
    }
    public int dfs(Map<String, Integer> sti,  Map<Integer, Integer> count, List<TreeNode> ans, TreeNode n) {
        if (n == null) return 0;
        int left = dfs(sti, count, ans, n.left);
        int right = dfs(sti, count, ans, n.right);
        StringBuilder sb = new StringBuilder();
        String serial = sb.append(n.val).append(",").append(left).append(",").append(right).toString();
        int id = sti.computeIfAbsent(serial, k -> sti.size() + 1);
        count.put(id, count.getOrDefault(id, 0) + 1);
        if (count.get(id) == 2) ans.add(n);
        return id;
    }
}