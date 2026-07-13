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
    int height;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        help(root);
        return height;
    }
    int help(TreeNode root)
    {
        if(root == null) return 0;

        int l = help(root.left);
        int r = help(root.right);
        height = Math.max(height, l+r);
        return 1 + Math.max(l , r);
    }
}
