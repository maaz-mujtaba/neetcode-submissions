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
    int globalMax = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return globalMax;
    }

    int dfs(TreeNode root){
        if(root == null) return 0;

        int l = Math.max(dfs(root.left),0);
        int r = Math.max(dfs(root.right),0);

        int sum = root.val + l + r;

        globalMax = Math.max(globalMax,sum);
        return root.val + Math.max(l,r);
    }
}
