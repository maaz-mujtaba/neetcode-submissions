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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true;
        if(root == null) return false;
        if (isSame(root,subRoot)) return true;

        return (isSame(root.left, subRoot) || isSame(root.right,subRoot));
    }
    boolean isSame(TreeNode tree1, TreeNode tree2)
    {
        if(tree1 == null && tree2==null) return true;

        if(tree1 == null || tree2==null) return false;
        if(tree1.val != tree2.val) return false;

        return isSame(tree1.left,tree2.left) && isSame(tree1.right,tree2.right);
    }
}
