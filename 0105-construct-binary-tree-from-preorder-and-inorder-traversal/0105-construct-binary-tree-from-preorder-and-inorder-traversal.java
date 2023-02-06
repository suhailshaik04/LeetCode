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
    int preindex=0;
    TreeNode checkTree(int[] preorder,int[] inorder,int is,int ie){
        if(is>ie) return null;
        TreeNode root=new TreeNode(preorder[preindex++]);
        int inindex=0;
        for(int i=is;i<=ie;i++){
            if(inorder[i]==root.val){
                inindex=i;
                break;
            }

        }
        root.left=checkTree(preorder,inorder,is,inindex-1);
        root.right=checkTree(preorder,inorder,inindex+1,ie);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int is=0,ie=inorder.length-1;
        return checkTree(preorder,inorder,is,ie);
    }
}
