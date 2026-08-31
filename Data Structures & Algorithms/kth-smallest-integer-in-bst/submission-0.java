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
    int res;
    int limit;
    public int kthSmallest(TreeNode root, int k) {
        limit = k;
        res = 0;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root)
    {
        if(root == null) return;
        dfs(root.left);
        limit--;
        if(limit == 0) res = root.val;
        dfs(root.right);
    }
}
